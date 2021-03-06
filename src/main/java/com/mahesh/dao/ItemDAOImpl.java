package com.mahesh.dao;
 
import java.util.List;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahesh.model.Item;
 
@Repository
public class ItemDAOImpl implements ItemDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addItem(Item item) {
        sessionFactory.getCurrentSession().saveOrUpdate(item);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Item> getAllItems() {
 
        return sessionFactory.getCurrentSession().createQuery("from Item")
                .list();
    }
 
    @Override
    public void deleteItem(Integer itemId) {
        Item item = (Item) sessionFactory.getCurrentSession().load(
                Item.class, itemId);
        if (null != item) {
            this.sessionFactory.getCurrentSession().delete(item);
        }
 
    }
 
    public Item getItem(int itemId) {
        return (Item) sessionFactory.getCurrentSession().get(
                Item.class, itemId);
    }
 
    @Override
    public Item updateItem(Item item) {
        sessionFactory.getCurrentSession().update(item);
        return item;
    }
 
}