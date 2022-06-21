package org.mohamedabukar.restaurantapp.repository;

import org.mohamedabukar.restaurantapp.entity.Foods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodsRepository extends JpaRepository<Foods, Long> {
//    @Modifying
//    @Query("insert into orders(id, food-name, price) select :food-id, :name, :price from foods")
//    public int insertOrder(@Param("food-id")Long foodId, @Param("name")String name, @Param("price")int price);
}
