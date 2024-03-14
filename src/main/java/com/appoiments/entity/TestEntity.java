package com.appoiments.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Tests")
//@IdClass(value = TestEntityCompound.class)
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    //@Id
    //@GeneratedValue
    @Column(name="test_name", nullable = false)
    private String testName;

    @Column(name="comments", length = 100)
    private String comments;

    @OneToMany(mappedBy = "idTest", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AppoimentEntity> appoimentDtoIdTests;

    /*@OneToMany(mappedBy = "testName", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<AppoimentEntity> appoimentDtoTestName;*/

    public TestEntity() {
    }

    public TestEntity(int id, String testName) {
        this.id = id;
        this.testName = testName;
    }

    public TestEntity(int id, String testName, String comments) {
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
