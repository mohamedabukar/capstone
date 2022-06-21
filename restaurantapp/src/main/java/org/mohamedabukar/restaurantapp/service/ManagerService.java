package org.mohamedabukar.restaurantapp.service;

import org.mohamedabukar.restaurantapp.entity.Employee;
import org.mohamedabukar.restaurantapp.entity.Foods;
import org.mohamedabukar.restaurantapp.repository.EmployeeRepository;
import org.mohamedabukar.restaurantapp.repository.FoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private EmployeeRepository eRepo;


    public List<Employee> getAllEmployees(){
        return eRepo.findAll();
    }
    public void saveEmployees(Employee employee){
        eRepo.save(employee);
    }

    public Employee getEmployeeById(long id){

        if(eRepo.findById(id).isPresent()){
            return eRepo.findById(id).get();
        } else{
            throw new RuntimeException("Employee not found");
        }

    }
    public void deleteById(long id){
        if(eRepo.findById(id).isPresent()){
            eRepo.deleteById(id);
        }else{
            throw new RuntimeException("Employee not found");
        }
    }

}
