package com.mahesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahesh.dao.ItemDAO;
import com.mahesh.model.Item;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDAO itemDAO;

    @Override
    @Transactional
    public void addItem(Item item) {
	itemDAO.addItem(item);
    }

    @Override
    @Transactional
    public List<Item> getAllItems() {
	return itemDAO.getAllItems();
    }

    @Override
    @Transactional
    public void deleteItem(Integer itemId) {
	itemDAO.deleteItem(itemId);
    }

    public Item getItem(int itemId) {
	return itemDAO.getItem(itemId);
    }

    public Item updateItem(Item item) {
	return itemDAO.updateItem(item);
    }

    public void setItemDAO(ItemDAO itemDAO) {
	this.itemDAO = itemDAO;
    }
}
