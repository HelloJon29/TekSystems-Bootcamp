package com.example.my_first_fullstack_project.shoppingcart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {
    private ShoppingCart cart;

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    public ShoppingCartController(ShoppingCart cart) {
        this.cart = cart;
    }

    @GetMapping("/items")
    public String getAllItems(Model model) {
        List<Item> items = cart.getItemList();
        logger.info("---INFO LOG TEST---");
        model.addAttribute("items", items);
        return "index_items";
    }

    @GetMapping("/itemForm")
    public String showItemForm(Model model) {
        // create model attribute to bind form data
        Item item = new Item();
        model.addAttribute("item", item);
        return "new_item";
    }

    @PostMapping("/items")
    public String saveItem(@ModelAttribute("item") Item item) {
        cart.addItem(item);
        return "redirect:/items";
    }

    @RequestMapping("/checkLogs")
    public String demoLogs() {
        logger.trace("This is a trace log example");
        logger.info("This is a info log example");
        logger.debug("This is a debug log example");
        logger.error("This is a error log example");
        logger.warn("This is a warn log example");
        return "Check the logs!";
    }
}
