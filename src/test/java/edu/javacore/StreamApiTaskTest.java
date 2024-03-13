package edu.javacore;

import edu.javacore.domain.Employee;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static edu.javacore.EmployeeUtil.employee1;
import static edu.javacore.EmployeeUtil.employee3;
import static edu.javacore.EmployeeUtil.employee4;
import static edu.javacore.EmployeeUtil.employee5;
import static edu.javacore.EmployeeUtil.getCompanies;
import static edu.javacore.EmployeeUtil.getEmployees;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StreamApiTaskTest {

    @Test
    @Order(1)
    void getEmployeeNames() {
        List<String> actual = StreamApiTask.getEmployeeNames(getEmployees());
        assertThat(actual)
                .hasSize(6)
                .contains("Ivan", "Olesia", "Danylo", "Kateryna", "Petro", "Ivan");
    }

    @Test
    @Order(2)
    void getEmployeeNamesStartedFrom() {
        List<String> actual = StreamApiTask.getEmployeeNamesStartedFrom(getEmployees(), "D");
        assertThat(actual)
                .hasSize(1)
                .contains("Danylo");
    }

    @Order(3)
    @Test
    void getEmployeeNamesSorted() {
        List<String> actual = StreamApiTask.getEmployeeNamesSorted(getEmployees());
        assertEquals(List.of("Danylo", "Ivan", "Ivan", "Kateryna", "Olesia", "Petro"), actual);
    }

    @Test
    @Order(4)
    void getEmployeeJoinCompanyIn2019() {
        List<Employee> actual = StreamApiTask.getEmployeeJoinCompanyIn2019(getEmployees());
        assertThat(actual)
                .hasSize(1)
                .contains(employee3);
    }

    @Test
    @Order(5)
    void getEmployeeWithJava() {
        List<Employee> actual = StreamApiTask.getEmployeesWithJava(getEmployees());
        assertThat(actual)
                .hasSize(3)
                .contains(employee1, employee3, employee4);
    }

    @Test
    @Order(6)
    void getEmployeesFromWorkingBlock() {
        List<Employee> actual = StreamApiTask.getEmployeesFromWorkingBlock(getEmployees(), "3K");
        assertThat(actual)
                .hasSize(1)
                .contains(employee1);
    }

    @Test
    @Order(7)
    void getEmployeesOlderThan25Years() {
        List<Employee> actual = StreamApiTask.getEmployeesOlderThan25Years(getEmployees());
        assertThat(actual)
                .hasSize(4)
                .contains(employee3, employee4, employee5, employee1);
    }

    @Test
    @Order(8)
    void getEmployeeNamesWithTop3Salary() {
        List<String> actual = StreamApiTask.getEmployeeNamesWithTop3Salary(getEmployees());
        assertThat(actual)
                .hasSize(3)
                .contains("Kateryna", "Danylo", "Olesia");
    }

    @Test
    @Order(9)
    void getEmployeeHiredInYearSortedByNames() {
        List<Employee> actual = StreamApiTask.getEmployeeHiredInYearSortedByNames(getEmployees(), 2018);
        assertEquals(List.of(employee4, employee5), actual);
    }

    @Test
    @Order(10)
    void getEmployeeHiredInYearSortedByNamesEmptyResult() {
        List<Employee> actual = StreamApiTask.getEmployeeHiredInYearSortedByNames(getEmployees(), 2010);
        assertEquals(Collections.emptyList(), actual);
    }

    @Test
    @Order(11)
    void getUniqueEmployeeNames() {
        List<String> actual = StreamApiTask.getUniqueEmployeeNames(getEmployees());
        assertThat(actual).hasSize(5).contains("Ivan", "Olesia", "Danylo", "Kateryna", "Petro");
    }

    @Test
    @Order(12)
    void isAnyEmployeeWithName() {
        boolean actual = StreamApiTask.isAnyEmployeeWithName(getEmployees(), "Danylo");
        assertTrue(actual);
    }

    @Test
    @Order(13)
    void isAnyEmployeeWithNameNegative() {
        boolean actual = StreamApiTask.isAnyEmployeeWithName(getEmployees(), "Olena");
        assertFalse(actual);
    }

    @Test
    @Order(14)
    void isAnyEmployeeWithNameWorksInBlock() {
        boolean actual = StreamApiTask.isAnyEmployeeWithNameWorksInBlock(getEmployees(), "Petro", "4L");
        assertTrue(actual);
    }

    @Test
    @Order(15)
    void isAnyEmployeeWithNameWorksInBlockNegative() {
        boolean actual = StreamApiTask.isAnyEmployeeWithNameWorksInBlock(getEmployees(), "Petro", "3K");
        assertFalse(actual);
    }

    @Test
    @Order(16)
    void isAnyEmployeeWithSalaryLessThan() {
        boolean actual = StreamApiTask.isAnyEmployeeWithSalaryLessThan(getEmployees(), 500);
        assertTrue(actual);
    }

    @Test
    @Order(17)
    void isAnyEmployeeWithSalaryLessThanNegative() {
        boolean actual = StreamApiTask.isAnyEmployeeWithSalaryLessThan(getEmployees(), 100);
        assertFalse(actual);
    }

    @Test
    @Order(18)
    void getTotalCompanySalary() {
        long actual = StreamApiTask.getTotalCompanySalary(getEmployees());
        assertEquals(1620, actual);
    }

    @Test
    @Order(19)
    void raiseSalaryForAllCompany() {
        List<Employee> employees = getEmployees().stream().map(SerializationUtils::clone).collect(Collectors.toList());
        StreamApiTask.raiseSalaryForAllEmployees(employees, 100);
        assertThat(employees).extracting(Employee::getSalary)
                .contains(300L, 400L, 410L, 570L, 240L, 300L);
    }

    @Test
    @Order(20)
    void countNumberOfEmployeesWithSalaryMoreThan() {
        int actual = StreamApiTask.countNumberOfEmployeesWithSalaryMoreThan(getEmployees(), 400);
        assertEquals(1, actual);
    }

    @Test
    @Order(21)
    void findMaxSalaryOnMarket() {
        long actual = StreamApiTask.findMaxSalaryOnMarket(getCompanies());
        assertEquals(470L, actual);
    }

}