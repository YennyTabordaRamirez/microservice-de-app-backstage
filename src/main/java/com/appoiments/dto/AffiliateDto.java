package com.appoiments.dto;

public class AffiliateDto {

    private int id;
    private String fullName;
    private int age;
    private String email;

    public AffiliateDto() {
    }

    public AffiliateDto(int id, String fullName, int age, String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AffiliateDto{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
