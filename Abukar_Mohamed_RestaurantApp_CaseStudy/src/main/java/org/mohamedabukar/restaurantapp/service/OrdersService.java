package org.mohamedabukar.restaurantapp.service;

import org.mohamedabukar.restaurantapp.entity.Orders;
import org.mohamedabukar.restaurantapp.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository oRepo;

    //method to show all orders
    public List<Orders> showOrders(){
        return oRepo.findAll();
    }

    //method to get a specific order by food id
    public Orders getOrderById(Long foodId){
        return oRepo.findId(foodId);
    }

    //method to delete order by food id
    public void deleteOrder(Long foodId){
        oRepo.deleteById(foodId);
    }
}
