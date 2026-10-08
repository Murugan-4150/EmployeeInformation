package com.example.EmployeeInformation.Dto;

public class EmployeeResponseDto {

    Integer Id;

    String name;

    int age;

    double sal;

    public EmployeeResponseDto(Integer id, String name, int age, double sal) {
        Id = id;
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
