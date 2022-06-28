package org.mohamedabukar.restaurantapp.service;

import org.junit.jupiter.api.Test;
import org.mohamedabukar.restaurantapp.entity.Employee;
import org.mohamedabukar.restaurantapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ManagerServiceTest {

    @Autowired
    private ManagerService mService;

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository eRepo;

    @Test
    public void saveEmployee(){
            Employee e = new Employee();
            e.setName("Test");
            e.setEmail("test@test.com");
            e.setDepartment("Test");
            e.setPassword("Test");

            Employee savedEmp = eRepo.save(e);

            Employee existedEmp = entityManager.find(Employee.class, savedEmp.getId());

            assertThat(existedEmp.getEmail().equals(e.getEmail()));
        }
}

