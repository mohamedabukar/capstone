package org.mohamedabukar.restaurantapp.config;

import org.mohamedabukar.restaurantapp.entity.Employee;
import org.mohamedabukar.restaurantapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeRepository eRepo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Employee employee = eRepo.findByEmail(email);
        if(employee == null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(employee);
    }
}
