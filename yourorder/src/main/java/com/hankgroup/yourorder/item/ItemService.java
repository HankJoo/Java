package com.hankgroup.yourorder.item;

import java.util.List;

public interface ItemService {

    List<Item> getItem(final long id);
    Item createItem(Item item);


}
