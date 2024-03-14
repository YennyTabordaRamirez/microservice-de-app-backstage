package com.appoiments.dto;

public class TestDto {

    private int id;
    private String testName;
    private String comments;

    public TestDto() {
    }

    public TestDto(int id, String testName) {
        this.id = id;
        this.testName = testName;
    }

    public TestDto(int id, String testName, String comments) {
        this.id = id;
        this.testName = testName;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "id=" + id +
                ", testName='" + testName + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
