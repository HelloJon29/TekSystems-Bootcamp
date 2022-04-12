package com.example.my_first_fullstack_project.shoppingcart;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
@Controller
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS) // this annotation persists a new object for every session
public class ShoppingCart {
    private List<Item> itemList = new ArrayList<>();

    public ShoppingCart() {
        itemList.add(new Item("tv"));
        itemList.add(new Item("monitor"));
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }
}
