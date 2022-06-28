package org.mohamedabukar.restaurantapp.config;

import org.mohamedabukar.restaurantapp.entity.Employee;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private Employee employee;

    public CustomUserDetails(Employee employee) {
        this.employee = employee;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    //method to get the password of an employee
    @Override
    public String getPassword() {
        return employee.getPassword();
    }

    //method to get username for employee
    @Override
    public String getUsername() {
        return employee.getEmail();
    }

    //method to check if account is expired
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //method to check if account is non locked
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //method to see if credentials is non expired
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //method to see if employee is enabled
    @Override
    public boolean isEnabled() {
        return true;
    }
}
