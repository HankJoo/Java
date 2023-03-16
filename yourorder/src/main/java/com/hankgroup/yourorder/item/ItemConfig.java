package com.hankgroup.yourorder.item;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ItemConfig {
    @Bean
    public ItemService itemService() {
        System.out.println("### 1. ItemConfig:: itemService bean created");
        return new ItemServiceImpl(itemRepository());
    }

    @Bean
    public ItemRepository itemRepository() {
        System.out.println("### 2. ItemConfig:: itemRepository bean created");
        return new ItemRepositoryImpl();
    }
}
