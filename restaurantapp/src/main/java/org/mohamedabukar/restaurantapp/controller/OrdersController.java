package org.mohamedabukar.restaurantapp.controller;

import org.mohamedabukar.restaurantapp.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrdersController {
    @Autowired
    private OrdersService oService;
}
