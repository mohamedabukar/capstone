package org.mohamedabukar.restaurantapp.repository;

import org.mohamedabukar.restaurantapp.entity.Foods;
import org.mohamedabukar.restaurantapp.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    //query to find orders by food id
    @Query("SELECT u FROM Orders u WHERE u.foodId = ?1")
    Orders findId(Long foodId);
}
