package org.mohamedabukar.restaurantapp.service;

import org.mohamedabukar.restaurantapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private EmployeeRepository eRepo;


}
