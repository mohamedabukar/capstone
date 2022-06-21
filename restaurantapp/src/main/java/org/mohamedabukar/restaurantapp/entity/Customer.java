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
    public String name;
    public String email;
    public String password;
}
