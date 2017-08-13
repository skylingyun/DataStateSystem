package com.ybz.entity;

import java.io.Serializable;

/**
 * 租户信息
 *
 * @author zhangybt
 * @create 2017年08月01日 19:37
 **/
public class Tenant implements Serializable {

    private String tenantId;
    private String tenantName;
    private String tenantAddress;
    private String tenantEmail;
    private String tenantFullname;
    private String tenantTel;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantAddress() {
        return tenantAddress;
    }

    public void setTenantAddress(String tenantAddress) {
        this.tenantAddress = tenantAddress;
    }

    public String getTenantEmail() {
        return tenantEmail;
    }

    public void setTenantEmail(String tenantEmail) {
        this.tenantEmail = tenantEmail;
    }

    public String getTenantFullname() {
        return tenantFullname;
    }

    public void setTenantFullname(String tenantFullname) {
        this.tenantFullname = tenantFullname;
    }

    public String getTenantTel() {
        return tenantTel;
    }

    public void setTenantTel(String tenantTel) {
        this.tenantTel = tenantTel;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "tenantId='" + tenantId + '\'' +
                ", tenantName='" + tenantName + '\'' +
                ", tenantAddress='" + tenantAddress + '\'' +
                ", tenantEmail='" + tenantEmail + '\'' +
                ", tenantFullname='" + tenantFullname + '\'' +
                ", tenantTel='" + tenantTel + '\'' +
                '}';
    }
}
