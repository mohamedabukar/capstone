package org.mohamedabukar.restaurantapp.service;

import org.junit.jupiter.api.Test;
import org.mohamedabukar.restaurantapp.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class OrdersServiceTest {

    @Autowired
    private OrdersService oService;

    @Test
    public void testDeleteOrder() {
        Orders order = oService.getOrderById(1L);
        oService.deleteOrder(1L);

        assertThat(order).isNull();
    }
}