package org.mohamedabukar.restaurantapp.repository;

import org.mohamedabukar.restaurantapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //query to find a specific employee by its employee id for log in purposes
    @Query("SELECT u FROM Employee u WHERE u.email = ?1")
    Employee findByEmail(String email);
}
