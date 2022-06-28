package org.mohamedabukar.restaurantapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name =  "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //rows for employee table
    private String name;
    private String email;
    private String password;
    private String department;
}
