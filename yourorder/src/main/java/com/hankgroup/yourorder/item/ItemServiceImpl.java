package com.hankgroup.yourorder.item;

import java.util.List;

public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item createItem(Item item) {
        System.out.println("##### ItemService: create a new Item");
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getItem(final long id){
        return itemRepository.findById(id);
    }
}
