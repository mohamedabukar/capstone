package org.mohamedabukar.restaurantapp;

import org.junit.jupiter.api.Test;
import org.mohamedabukar.restaurantapp.entity.Employee;
import org.mohamedabukar.restaurantapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class EmployeeRepositoryTests {
    @Autowired
    private EmployeeRepository eRepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        Employee e = new Employee();
        e.setName("Test");
        e.setEmail("test@test.com");
        e.setDepartment("Test");
        e.setPassword("Test");

        Employee savedEmp = eRepo.save(e);

        Employee existedEmp = entityManager.find(Employee.class, savedEmp.getId());

        assertThat(existedEmp.getEmail().equals(e.getEmail()));
    }

    @Test
    public void testFindByEmail(){
        String email=  "test@test.com";
        Employee emp = eRepo.findByEmail(email);

        assertThat(emp).isNotNull();
    }
}
