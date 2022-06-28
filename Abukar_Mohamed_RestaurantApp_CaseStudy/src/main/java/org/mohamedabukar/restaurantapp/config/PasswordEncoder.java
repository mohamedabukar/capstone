package org.mohamedabukar.restaurantapp.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//class for encoding passwords
public class PasswordEncoder {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "Test";
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }

}
