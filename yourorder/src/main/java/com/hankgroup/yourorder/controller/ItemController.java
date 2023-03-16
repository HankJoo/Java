package com.hankgroup.yourorder.controller;

import com.hankgroup.yourorder.item.Item;
import com.hankgroup.yourorder.item.ItemRepository;
import com.hankgroup.yourorder.item.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping("/{id}")
    public List<Item> getListById(@PathVariable("id") final long id) throws Exception {
        return itemService.getItem(id);
    }
}
