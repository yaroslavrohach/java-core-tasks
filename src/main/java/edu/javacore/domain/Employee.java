package edu.javacore.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public final class Employee implements Serializable {
    private final String name;
    private final LocalDate dateOfBirth;
    private final LocalDate dateOfJoin;
    private final String workingBlock;
    private final int workingPlaceNumber;
    private Long salary;
    private final Set<Skill> skills;

    public enum Skill {JAVA, C, PYTHON, KOTLIN, SCALA, GOLANG, JAVASCRIPT}

    public Employee(
            String name,
            LocalDate dateOfBirth,
            LocalDate dateOfJoin,
            String workingBlock,
            int workingPlaceNumber,
            Long salary,
            Set<Skill> skills
    ) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoin = dateOfJoin;
        this.workingBlock = workingBlock;
        this.workingPlaceNumber = workingPlaceNumber;
        this.salary = salary;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfJoin() {
        return dateOfJoin;
    }

    public String getWorkingBlock() {
        return workingBlock;
    }

    public int getWorkingPlaceNumber() {
        return workingPlaceNumber;
    }

    public Long getSalary() {
        return salary;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return workingPlaceNumber == employee.workingPlaceNumber && Objects.equals(name, employee.name) && Objects.equals(dateOfBirth, employee.dateOfBirth) && Objects.equals(dateOfJoin, employee.dateOfJoin) && Objects.equals(workingBlock, employee.workingBlock) && Objects.equals(salary, employee.salary) && Objects.equals(skills, employee.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, dateOfJoin, workingBlock, workingPlaceNumber, salary, skills);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfJoin=" + dateOfJoin +
                ", workingBlock='" + workingBlock + '\'' +
                ", workingPlaceNumber=" + workingPlaceNumber +
                ", salary=" + salary +
                ", skills=" + skills +
                '}';
    }
}
