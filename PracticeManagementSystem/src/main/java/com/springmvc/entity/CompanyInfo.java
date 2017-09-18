package com.springmvc.entity;

public class CompanyInfo {
    private Integer cid;

    private String cname;

    private String cpassword;

    private Integer praiserate;

    private String address;

    private Integer telephone;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public Integer getPraiserate() {
        return praiserate;
    }

    public void setPraiserate(Integer praiserate) {
        this.praiserate = praiserate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
}