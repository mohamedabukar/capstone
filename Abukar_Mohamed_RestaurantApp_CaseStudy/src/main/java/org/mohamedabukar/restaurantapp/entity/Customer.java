package org.mohamedabukar.restaurantapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name =  "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    //Rows for customer table
    public String name;
    public String email;
    public String password;
}
