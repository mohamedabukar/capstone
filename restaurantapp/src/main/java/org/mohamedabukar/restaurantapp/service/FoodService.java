package org.mohamedabukar.restaurantapp.service;

import org.mohamedabukar.restaurantapp.entity.Foods;
import org.mohamedabukar.restaurantapp.entity.Orders;
import org.mohamedabukar.restaurantapp.repository.FoodsRepository;
import org.mohamedabukar.restaurantapp.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private OrdersRepository oRepo;
    @Autowired
    private FoodsRepository fRepo;

    public List<Foods> showFoods(){
        return fRepo.findAll();
    }

    public void saveFoods(Foods food){
        fRepo.save(food);
    }

    public Foods getFoodById(long id){
        return fRepo.findById(id).get();
    }

    public void deleteFood(long id){
        fRepo.deleteById(id);
    }

    public void addToorder(Foods food){
        Orders order = new Orders();
        order.setFoodId(food.getFoodId());
        order.setFoodName(food.getName());
        order.setIngredients(food.getIngredients());
        order.setPrice(food.getPrice());
        oRepo.save(order);
    }
}
