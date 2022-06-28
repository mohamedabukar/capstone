package org.mohamedabukar.restaurantapp.controller;

import org.mohamedabukar.restaurantapp.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrdersController {
    @Autowired
    private OrdersService oService;

    @GetMapping("/cart")
    public String showOrders(Model model){
        model.addAttribute("order",oService.showOrders());
        return "shopping-cart";
    }

    @GetMapping("/deleteOrder")
    public String deleteOrder(@RequestParam long foodId){
        oService.deleteOrder(foodId);
        return "redirect:/employeePage";
    }

    @GetMapping("/employeePage")
    public String employeePage(Model model){
        model.addAttribute("orders",oService.showOrders());
        return "employee";
    }
}
