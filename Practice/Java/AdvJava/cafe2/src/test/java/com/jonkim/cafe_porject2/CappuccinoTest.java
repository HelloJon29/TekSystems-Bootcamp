package com.jonkim.cafe_porject2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CappuccinoTest {

    @Test
    void calculateSubTotal() {
        Cappuccino jonsOrder = new Cappuccino("testCap", 2.50, "Sweet",true,true);
        Cappuccino mosOrder = new Cappuccino("Mos", 3.50, "Sweet",false,true);

        mosOrder.setPrice(2.50);
        mosOrder.setQuantity(1);
        jonsOrder.setQuantity(1);

        assertThat(jonsOrder.calculateSubTotal()).isEqualTo(mosOrder.calculateSubTotal());
        assertThat(jonsOrder.isPeppermint()).isEqualTo(mosOrder.isPeppermint());
    }
}