package edu.javacore;

import edu.javacore.domain.Company;
import edu.javacore.domain.Employee;
import edu.javacore.domain.EmployeeBuilder;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class EmployeeUtil {

    static Employee employee1 = new EmployeeBuilder()
        .setName("Ivan")
        .setDateOfBirth(LocalDate.of(1992, 3, 2))
        .setDateOfJoin(LocalDate.of(2015, 9, 1))
        .setSalary(200L)
        .setWorkingBlock("3K")
        .setWorkingPlaceNumber(62)
        .setSkills(Set.of(Employee.Skill.JAVA))
        .build();

    static Employee employee2 = new EmployeeBuilder()
        .setName("Olesia")
        .setDateOfBirth(LocalDate.of(2003, 5, 24))
        .setDateOfJoin(LocalDate.of(2017, 1, 5))
        .setSalary(300L)
        .setWorkingBlock("3C")
        .setWorkingPlaceNumber(15)
        .setSkills(Set.of(Employee.Skill.PYTHON))
        .build();

    static Employee employee3 = new EmployeeBuilder()
        .setName("Danylo")
        .setDateOfBirth(LocalDate.of(1987, 5, 21))
        .setDateOfJoin(LocalDate.of(2019, 6, 14))
        .setSalary(310L)
        .setWorkingBlock("2R")
        .setWorkingPlaceNumber(12)
        .setSkills(Set.of(Employee.Skill.JAVA, Employee.Skill.GOLANG))
        .build();

    static Employee employee4 = new EmployeeBuilder()
        .setName("Kateryna")
        .setDateOfBirth(LocalDate.of(1981, 5, 21))
        .setDateOfJoin(LocalDate.of(2018, 10, 12))
        .setSalary(470L)
        .setWorkingBlock("6R")
        .setWorkingPlaceNumber(12)
        .setSkills(Set.of(Employee.Skill.JAVA, Employee.Skill.SCALA))
        .build();

    static Employee employee5 = new EmployeeBuilder()
        .setName("Petro")
        .setDateOfBirth(LocalDate.of(1985, 5, 21))
        .setDateOfJoin(LocalDate.of(2018, 10, 12))
        .setSalary(140L)
        .setWorkingBlock("4L")
        .setWorkingPlaceNumber(12)
        .setSkills(Set.of(Employee.Skill.KOTLIN))
        .build();

    static Employee employee6 = new EmployeeBuilder()
        .setName("Ivan")
        .setDateOfBirth(LocalDate.of(2001, 6, 25))
        .setDateOfJoin(LocalDate.of(2016, 10, 12))
        .setSalary(200L)
        .setWorkingBlock("5C")
        .setWorkingPlaceNumber(22)
        .setSkills(Set.of(Employee.Skill.JAVASCRIPT))
        .build();

    static List<Employee> getEmployees() {
        return List.of(employee1, employee2, employee3, employee4, employee5, employee6);
    }

    static List<Company> getCompanies() {
        Company company1 = new Company(List.of(employee1, employee2, employee3));
        Company company2 = new Company(List.of(employee4, employee5, employee6));
        return List.of(company1, company2);
    }
}
