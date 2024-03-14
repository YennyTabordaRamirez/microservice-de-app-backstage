package com.appoiments.dto;

import java.util.List;

public class MasterDto {

    private int idAffiliate;
    private String name;
    private Integer age;
    private String email;
    private List<AppoimentDto> appTests;

    public MasterDto() {
    }

    public MasterDto(int idAffiliate, String name, Integer age, String email, List<AppoimentDto> appTests) {
        this.idAffiliate = idAffiliate;
        this.name = name;
        this.age = age;
        this.email = email;
        this.appTests = appTests;
    }

    public int getIdAffiliate() {
        return idAffiliate;
    }

    public void setIdAffiliate(int idAffiliate) {
        this.idAffiliate = idAffiliate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<AppoimentDto> getAppTests() {
        return appTests;
    }

    public void setAppTests(List<AppoimentDto> appTests) {
        this.appTests = appTests;
    }
}
