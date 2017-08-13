package com.ybz.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userid;

    private String userName;

    private String password;

    private Date birthday;

    private Date registerdate;

    private String location;

    private String company;

    private String email;

    private String phone;

    private String telnum;

    private String avatar;

    private String association;

    private String deptpk;

    private String deptname;

    private String userCode;

    private Date ts;

    private Boolean dr;

    private String postpk;

    private String postname;

    private String rankpk;

    private String rankname;

    private String deptcode;

    private String description;

//    private List<NcUser> ncUserList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum == null ? null : telnum.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getAssociation() {
        return association;
    }

    public void setAssociation(String association) {
        this.association = association == null ? null : association.trim();
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

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Boolean getDr() {
        return dr;
    }

    public void setDr(Boolean dr) {
        this.dr = dr;
    }

    public String getPostpk() {
        return postpk;
    }

    public void setPostpk(String postpk) {
        this.postpk = postpk == null ? null : postpk.trim();
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }

    public String getRankpk() {
        return rankpk;
    }

    public void setRankpk(String rankpk) {
        this.rankpk = rankpk == null ? null : rankpk.trim();
    }

    public String getRankname() {
        return rankname;
    }

    public void setRankname(String rankname) {
        this.rankname = rankname == null ? null : rankname.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

//    public List<NcUser> getNcUserList() {
//        return ncUserList;
//    }
//
//    public void setNcUserList(List<NcUser> ncUserList) {
//        this.ncUserList = ncUserList;
//    }
}