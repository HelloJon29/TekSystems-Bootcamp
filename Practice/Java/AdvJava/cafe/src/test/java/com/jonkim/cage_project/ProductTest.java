package com.jonkim.cage_project;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ProductTest {
    Product myTestProduct = new Product();
// WE GOT A TEST
    @Test
    public void testCalculateProductPrice() {
        myTestProduct.setPrice(10.50);
        myTestProduct.setQuantity(5);
        double subTotal = myTestProduct.getPrice() * myTestProduct.getQuantity();

        Assertions.assertThat(subTotal == myTestProduct.getPrice()* myTestProduct.getQuantity());
    }
}