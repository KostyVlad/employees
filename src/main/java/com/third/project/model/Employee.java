package com.third.project.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY, hidden = true)
    private Long id;

    private String fullName;
    private int age;
    private int yearsInFirm;
    private double salary;

    public Employee() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getYearsInFirm() { return yearsInFirm; }
    public void setYearsInFirm(int yearsInFirm) { this.yearsInFirm = yearsInFirm; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}