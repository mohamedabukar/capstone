package org.mohamedabukar.restaurantapp.controller;

import org.mohamedabukar.restaurantapp.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Service mService;


}
