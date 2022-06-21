package org.mohamedabukar.restaurantapp.repository;

import org.mohamedabukar.restaurantapp.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
