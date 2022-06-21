package org.mohamedabukar.restaurantapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name =  "manager")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long managerId;
    private String managerName;
    private String managerEmail;
    private String managerPassword;
}
