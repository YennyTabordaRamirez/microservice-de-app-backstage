/*
package com.appoiments.entity;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class TestEntityCompound implements Serializable {

    @Column(name="id", nullable = false)
    private int id;

    @Column(name="test_name", nullable = false)
    private String testName;

    public TestEntityCompound() {
    }

    public TestEntityCompound(int id, String testName) {
        this.id = id;
        this.testName = testName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, testName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestEntityCompound testEntityCompoundId = (TestEntityCompound) obj;
        return Objects.equals( id, testEntityCompoundId.id ) &&
                Objects.equals( testName, testEntityCompoundId.testName );
        //id.equals(testEntityCompoundId.id) && testName.equals(testEntityCompoundId.testName);
    }
}
*/
