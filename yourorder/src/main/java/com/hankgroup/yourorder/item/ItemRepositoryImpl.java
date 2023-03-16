package com.hankgroup.yourorder.item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepositoryImpl implements ItemRepository{
    @Override
    public Item save(Item item) {
        return new Item(
                item.getName(),
                item.getPrice(),
                item.getStockQuantity()
        );
    }

    @Override
    public List<Item> findById(long id) {
        List<Item> list = new ArrayList<>();
        list.add( new Item("test",1000,2));
        list.add( new Item("test",1000,2));
        return list;
    }
}
