package com.appoiments.dto;

import com.appoiments.entity.AffiliateEntity;
import com.appoiments.entity.TestEntity;

import java.util.Date;

public class AppoimentDto {

    private int id;
    private Date dateAppoiment;
    private Date hourAppoiment;
    private TestEntity idTest;
    private AffiliateEntity idAffiliate;

    public AppoimentDto() {
    }

    public AppoimentDto(int id, Date dateAppoiment, Date hourAppoiment, TestEntity idTest, AffiliateEntity idAffiliate) {
        this.id = id;
        this.dateAppoiment = dateAppoiment;
        this.hourAppoiment = hourAppoiment;
        this.idTest = idTest;
        this.idAffiliate = idAffiliate;
    }

    public AppoimentDto(int id, Date dateAppoiment, Date hourAppoiment, TestEntity idTest, Integer idAffiliate) {
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
