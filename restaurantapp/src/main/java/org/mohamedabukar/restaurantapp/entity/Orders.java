package org.mohamedabukar.restaurantapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name =  "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Orders {

    @Id
    private long foodId;
    private String foodName;
    private String ingredients;
    private String Quantity;
    private int Price;

}
