package com.appoiments.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Affiliates")
public class AffiliateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="full_name", nullable = false)
    private String fullName;

    @Column(name="age", nullable = false)
    private int age;

    @Column(name="email", nullable = false)
    private String email;

    @OneToMany(mappedBy = "idAffiliate", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<AppoimentEntity> appoimentDto;

    public AffiliateEntity() {
    }

    public AffiliateEntity(int id, String fullName, int age, String email) {
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
