package com.hankgroup.yourorder.item;

import java.util.List;

public interface ItemRepository {
    Item save(Item item);

    List<Item> findById(long id);
}
