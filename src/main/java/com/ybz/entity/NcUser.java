package com.ybz.entity;

import java.util.Date;

public class NcUser {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String pk;

    private String userid;

    private String parent;

    private String usercode;

    private String userpk;

    private String password;

    private Boolean valid;

    private Date ts;

    private String deptpk;

    private String deptname;

    private String orgpk;

    private String orgname;

    private String pcode;

    private String passengerid;

    private String fatherdeptpk;

    private String fatherdeptname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk == null ? null : pk.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUserpk() {
        return userpk;
    }

    public void setUserpk(String userpk) {
        this.userpk = userpk == null ? null : userpk.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getDeptpk() {
        return deptpk;
    }

    public void setDeptpk(String deptpk) {
        this.deptpk = deptpk == null ? null : deptpk.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getOrgpk() {
        return orgpk;
    }

    public void setOrgpk(String orgpk) {
        this.orgpk = orgpk == null ? null : orgpk.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid == null ? null : passengerid.trim();
    }

    public String getFatherdeptpk() {
        return fatherdeptpk;
    }

    public void setFatherdeptpk(String fatherdeptpk) {
        this.fatherdeptpk = fatherdeptpk == null ? null : fatherdeptpk.trim();
    }

    public String getFatherdeptname() {
        return fatherdeptname;
    }

    public void setFatherdeptname(String fatherdeptname) {
        this.fatherdeptname = fatherdeptname == null ? null : fatherdeptname.trim();
    }
}