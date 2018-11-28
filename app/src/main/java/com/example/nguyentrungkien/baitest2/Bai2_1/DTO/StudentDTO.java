package com.example.nguyentrungkien.baitest2.Bai2_1.DTO;

public class StudentDTO {
    String name;
    int age;
    String city;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StudentDTO() {

    }

    public StudentDTO(String name, int age, String city) {

        this.name = name;
        this.age = age;
        this.city = city;
    }
}
