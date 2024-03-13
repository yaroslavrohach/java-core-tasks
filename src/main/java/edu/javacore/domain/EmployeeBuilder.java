package edu.javacore.domain;

import java.time.LocalDate;
import java.util.Set;

public class EmployeeBuilder {
    private String name;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoin;
    private String workingBlock;
    private int workingPlaceNumber;
    private Long salary;
    private Set<Employee.Skill> skills;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public EmployeeBuilder setDateOfJoin(LocalDate dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
        return this;
    }

    public EmployeeBuilder setWorkingBlock(String workingBlock) {
        this.workingBlock = workingBlock;
        return this;
    }

    public EmployeeBuilder setWorkingPlaceNumber(int workingPlaceNumber) {
        this.workingPlaceNumber = workingPlaceNumber;
        return this;
    }

    public EmployeeBuilder setSalary(Long salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder setSkills(Set<Employee.Skill> skills) {
        this.skills = skills;
        return this;
    }

    public Employee build() {
        return new Employee(name, dateOfBirth, dateOfJoin, workingBlock, workingPlaceNumber, salary, skills);
    }
}