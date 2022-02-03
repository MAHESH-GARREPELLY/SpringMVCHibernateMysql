package com.mahesh.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mahesh.model.Item;
import com.mahesh.service.ItemService;

@Controller
public class ItemController {

    private static final Logger logger = Logger
		.getLogger(ItemController.class);

    public ItemController() {
		System.out.println("ItemController()");
	}

    @Autowired
    private ItemService itemService;


    @RequestMapping(value = {"", "/", "home"})
    public ModelAndView listItem(ModelAndView model) throws IOException {
    	List<Item> listItem = itemService.getAllItems();
    	model.addObject("listItem", listItem);
    	model.setViewName("home");
    	return model;
    }

    @RequestMapping(value = "/newItem", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
    	Item item = new Item();
    	model.addObject("movie", item);
    	model.setViewName("movie-form");
    	return model;
    }

    @RequestMapping(value = "/saveItem", method = RequestMethod.POST)
    public ModelAndView saveItem(@ModelAttribute Item item) {
        if (item.getId() == 0) { // if movie id is 0 then creating the
            // movie other updating the movie
            itemService.addItem(item);
    	} else {
            itemService.updateItem(item);
    	}
    	return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/deleteItem", method = RequestMethod.GET)
    public ModelAndView deleteItem(HttpServletRequest request) {
        int itemId = Integer.parseInt(request.getParameter("id"));
        itemService.deleteItem(itemId);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editItem", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int itemId = Integer.parseInt(request.getParameter("id"));
        Item item = itemService.getItem(itemId);
        ModelAndView model = new ModelAndView("movie-form");
        model.addObject("movie", item);

    	return model;
    }

}