package com.simtlix.consultafijapoc.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "VW_FIXED_SERVICES", schema = "EBILL")
public class SubscribedService {

    @Id
    private UUID id;

    @Column(name = "RATE_PLAN")
    private String plan;

    @Column(name = "CLU_CELLULAR_NUMBER")
    private Integer number;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

}
