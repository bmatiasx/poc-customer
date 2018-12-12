package com.simtlix.consultafijapoc.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@Entity
@Table(name = "VW_FIXED_SERVICES", schema = "EBILL")
public class Account {

    @Id
    @Column(name = "ACC_ID")
    private Integer accountId;

    @JsonIgnore
    @Column(name = "CLT_ID")
    private Integer clientId;

    @Transient
    private List<InstallationAddress> installationAddresses;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public List<InstallationAddress> getInstallationAddresses() {
        return installationAddresses;
    }

    public void setInstallationAddresses(List<InstallationAddress> installationAddresses) {
        this.installationAddresses = installationAddresses;
    }
}