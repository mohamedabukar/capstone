package org.mohamedabukar.restaurantapp.controller;

import org.mohamedabukar.restaurantapp.entity.Foods;
import org.mohamedabukar.restaurantapp.repository.FoodsRepository;
import org.mohamedabukar.restaurantapp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FoodsController {

    @Autowired
    private FoodService fService;

    @GetMapping("/")
    public String showFoods(Model model){
        model.addAttribute("foods",fService.showFoods());
        return "index";
    }
    @GetMapping("/menuManagement")
    public String manageFoods(Model model){
        model.addAttribute("food", fService.showFoods());
        return "menu-management";
    }

    @GetMapping("/addFood")
    public String addFoodsForm(Model model){
        Foods food = new Foods();
        model.addAttribute("food", food);
        return "add-foods";
    }

    @PostMapping("/saveFoods")
    public String saveFoods(@ModelAttribute Foods food){
        fService.saveFoods(food);
        return"redirect:/menuManagement";
    }
    @GetMapping("/updatefoodform")
    public String updateFoodForm(@RequestParam long foodId, Model model){
        Foods food = fService.getFoodById(foodId);
        model.addAttribute("food", food);
        return "add-foods";
    }
    @GetMapping("/deleteFood")
    public String deletefood(@RequestParam long foodId){
        fService.deleteFood(foodId);
        return "redirect:/menuManagement";
    }
    @PostMapping("/addToOrder")
    public String addToOrder(@ModelAttribute Foods food){
        System.out.println("@PostMapping");
        fService.addToorder(food);
        return "index";
    }
    @GetMapping("/addToOrder")
    public String addToOrder(){
        System.out.println("@GetMapping");
        return "index";
    }
}
