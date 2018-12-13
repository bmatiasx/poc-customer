package com.simtlix.consultafijapoc.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "VW_FIXED_SERVICES", schema = "EBILL")
public class Subscription {

    @Column(name = "ACC_ID")
    @JsonIgnore
    private Integer accountId;

    @Column(name = "CBT_ID")
    private String serviceTypeId;

    @Column(name = "CBT_DESCRIPTION")
    private String serviceTypeDescription;

    @Column(name = "RATE_PLAN")
    private String plan;

    @Id
    @Column(name = "CLU_CELLULAR_NUMBER")
    private Integer cellularNumber;

    public Integer getAccountId() {
        return accountId;
    }

    public String getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(String serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeDescription() {
        return serviceTypeDescription;
    }

    public void setServiceTypeDescription(String serviceTypeDescription) {
        this.serviceTypeDescription = serviceTypeDescription;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getCellularNumber() {
        return cellularNumber;
    }

    public void setCellularNumber(Integer cellularNumber) {
        this.cellularNumber = cellularNumber;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Subscription)) {
            return false;
        }

        Subscription subscription = (Subscription) o;
        return Objects.equals(accountId, subscription.accountId) &&
                Objects.equals(serviceTypeId, subscription.serviceTypeId) &&
                Objects.equals(serviceTypeDescription, subscription.serviceTypeDescription) &&
                Objects.equals(plan, subscription.plan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, serviceTypeId, serviceTypeDescription, plan);
    }
}
