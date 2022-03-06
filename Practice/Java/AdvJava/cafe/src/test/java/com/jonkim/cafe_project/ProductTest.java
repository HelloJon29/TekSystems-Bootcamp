package com.jonkim.cafe_project;


import static org.assertj.core.api.Assertions.assertThat;
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

        assertThat(subTotal).isEqualTo(myTestProduct.getPrice());
    }

    @Test
    public void tryToCalculateSalesTaxUsingCalculateProductPrice() {

    }

}