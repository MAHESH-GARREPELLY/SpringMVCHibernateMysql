package com.mahesh.service;
 
import java.util.List;

import com.mahesh.model.Item;
 
public interface ItemService {
     
    public void addItem(Item item);
 
    public List<Item> getAllItems();
 
    public void deleteItem(Integer itemId);
 
    public Item getItem(int itemid);
 
    public Item updateItem(Item item);
}
