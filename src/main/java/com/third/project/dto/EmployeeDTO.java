package com.third.project.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class EmployeeDTO {

    @NotBlank(message = "Имя не может быть пустым")
    @Pattern(regexp = "^[a-zA-Zа-яА-Яא-ת\\s]+$", message = "Only letters and spaces")
    private String fullName;

    @Min(value = 18, message = "min age 18")
    private int age;

    @Min(value = 0, message = "cant be negative")
    private int yearsInFirm;

    @Min(value = 0, message = "salary cant be negative")
    @Max(value = 50000, message = "salary cant be more then 50000")
    private double salary;

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getYearsInFirm() { return yearsInFirm; }
    public void setYearsInFirm(int yearsInFirm) { this.yearsInFirm = yearsInFirm; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}