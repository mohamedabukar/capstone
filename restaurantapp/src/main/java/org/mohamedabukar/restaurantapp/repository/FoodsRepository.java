package org.mohamedabukar.restaurantapp.repository;

import org.mohamedabukar.restaurantapp.entity.Employee;
import org.mohamedabukar.restaurantapp.entity.Foods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodsRepository extends JpaRepository<Foods, Long> {

    //query to find a food by the food id
    @Query("SELECT u FROM Foods u WHERE u.foodId = ?1")
    Foods findId(Long foodId);
}
