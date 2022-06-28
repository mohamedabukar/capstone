package org.mohamedabukar.restaurantapp;

import org.junit.jupiter.api.Test;
import org.mohamedabukar.restaurantapp.entity.Orders;
import org.mohamedabukar.restaurantapp.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class OrdersRepositoryTests {

    @Autowired
    private OrdersRepository oRepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testFindById(){
        Long id = 2L;
        Orders o = oRepo.findId(id);

        assertThat(o).isNotNull();
    }
}
