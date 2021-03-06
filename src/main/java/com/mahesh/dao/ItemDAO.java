package com.mahesh.dao;
 
import java.util.List;

import com.mahesh.model.Item;
 
public interface ItemDAO {
 
    public void addItem(Item item);
 
    public List<Item> getAllItems();
 
    public void deleteItem(Integer itemId);
 
    public Item updateItem(Item item);
 
    public Item getItem(int itemId);
}