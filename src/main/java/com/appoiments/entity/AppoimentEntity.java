package com.appoiments.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Appoiments")
public class AppoimentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="dat_appoiment")
    private Date dateAppoiment;

    @Column(name="hou_appoiment")
    private Date hourAppoiment;

    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Test")
    private TestEntity idTest;

/*    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_Name")
    private TestEntity testNamed;*/

    @ManyToOne
    @JoinColumn(name = "id_Affiliate")
    private AffiliateEntity idAffiliate;

    public AppoimentEntity() {
    }

    public AppoimentEntity(int id, Date dateAppoiment, Date hourAppoiment, TestEntity idTest, AffiliateEntity idAffiliate) {
        this.id = id;
        this.dateAppoiment = dateAppoiment;
        this.hourAppoiment = hourAppoiment;
        this.idTest = idTest;
        this.idAffiliate = idAffiliate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateAppoiment() {
        return dateAppoiment;
    }

    public void setDateAppoiment(Date dateAppoiment) {
        this.dateAppoiment = dateAppoiment;
    }

    public Date getHourAppoiment() {
        return hourAppoiment;
    }

    public void setHourAppoiment(Date hourAppoiment) {
        this.hourAppoiment = hourAppoiment;
    }

    public TestEntity getIdTest() {
        return idTest;
    }

    public void setIdTest(TestEntity idTest) {
        this.idTest = idTest;
    }

    public AffiliateEntity getIdAffiliate() {
        return idAffiliate;
    }

    public void setIdAffiliate(AffiliateEntity idAffiliate) {
        this.idAffiliate = idAffiliate;
    }
}
