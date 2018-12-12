package com.simtlix.consultafijapoc.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "VW_FIXED_SERVICES", schema = "EBILL")
public class InstallationAddress {

    @Id
    @Column(name = "ACC_ID")
    @JsonIgnore
    private Integer accountId;

    @Column(name = "CLT_ID")
    @JsonIgnore
    private Integer clientId;

    @Column(name = "AAA_ADDRESS_STREET")
    private String street;

    @Column(name = "AAA_ADDRESS_NUMBER")
    private String number;

    @Column(name = "AAA_ADDRESS_TOWER")
    private String tower;

    @Column(name = "AAA_ADDRESS_FLOOR")
    private String floor;

    @Column(name = "AAA_ADDRESS_FLAT")
    private String flat;

    @Column(name = "AAA_ADDRESS_WITHIN_STREETS")
    private String withinStreets;

    @Column(name = "AAA_ADDRESS_CITY")
    private String city;

    @Column(name = "AAA_ADDRESS_DEPARTMENT")
    private String department;

    @Transient
    private List<SubscribedService> subscribedServices;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTower() {
        return tower;
    }

    public void setTower(String tower) {
        this.tower = tower;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getWithinStreets() {
        return withinStreets;
    }

    public void setWithinStreets(String withinStreets) {
        this.withinStreets = withinStreets;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<SubscribedService> getSubscribedServices() {
        return subscribedServices;
    }

    public void setSubscribedServices(List<SubscribedService> subscribedServices) {
        this.subscribedServices = subscribedServices;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}
