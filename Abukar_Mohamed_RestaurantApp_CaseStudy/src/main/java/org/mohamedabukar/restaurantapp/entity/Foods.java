package org.mohamedabukar.restaurantapp.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name =  "foods")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Foods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;
    //rows for food table
    private String name;
    private String ingredients;
    private int price;
}
