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
    //method to show all the foods
    public List<Foods> showFoods(){
        return fRepo.findAll();
    }

    //method to save food in food table
    public void saveFoods(Foods food){
        fRepo.save(food);
    }
    //method to get a specific food from table by food id
    public Foods getFoodById(Long foodId){
        return fRepo.findId(foodId);
    }
    //method to delete food from food table
    public void deleteFood(Long foodId){
        fRepo.deleteById(foodId);
    }

    //method to add food into order table by food id
    public void addToorder(Foods food){
        Orders order = new Orders();
        order.setFoodId(food.getFoodId());
        order.setFoodName(food.getName());
        order.setIngredients(food.getIngredients());
        order.setPrice(food.getPrice());
        oRepo.save(order);
    }
}
