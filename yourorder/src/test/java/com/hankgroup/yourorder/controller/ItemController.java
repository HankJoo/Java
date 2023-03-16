package com.hankgroup.yourorder.controller;


import com.hankgroup.yourorder.item.Item;
import com.hankgroup.yourorder.item.ItemService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ItemController {

    private Item keyboardItem = new Item("키보드", 300000, 10);
    @Autowired
    private ItemService itemService;

    @Autowired
    private WebApplicationContext applicationContext;

    @Test
    @DisplayName("autowired bean from applicationContext")
    void useDI(){
        itemService.createItem(keyboardItem);
        assertThat(applicationContext.getBean(ItemService.class)).isNotNull();
        assertThat(itemService.getItem(1).size()).isEqualTo(2);
        assertThat(itemService.getItem(1).size()).isEqualTo(2);
        assertThat(itemService.getItem(1).size()).isEqualTo(2);
    }
}
