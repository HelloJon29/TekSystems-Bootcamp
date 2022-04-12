package com.example.my_first_fullstack_project.shoppingcart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {
    private ShoppingCart cart;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ShoppingCartController(ShoppingCart cart) {
        this.cart = cart;
    }

    @GetMapping("/items")
    public List<Item> getAllItems() {
        logger.info("---INFO LOG TEST---");
        return cart.getItemList();
    }

    @PostMapping("/items")
    public void addItem(@RequestBody Item item, Model model) {
        model.addAttribute("item", item);

        cart.addItem(item);
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
