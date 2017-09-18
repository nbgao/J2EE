package com.springmvc.entity;

public class TeacherInfo {
    private Integer tnumber;

    private String tpassword;

    private String tname;

    private Integer tidentity;

    private String tdepartment;

    private String tmajor;

    private String tphone;

    public Integer getTnumber() {
        return tnumber;
    }

    public void setTnumber(Integer tnumber) {
        this.tnumber = tnumber;
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getTidentity() {
        return tidentity;
    }

    public void setTidentity(Integer tidentity) {
        this.tidentity = tidentity;
    }

    public String getTdepartment() {
        return tdepartment;
    }

    public void setTdepartment(String tdepartment) {
        this.tdepartment = tdepartment;
    }

    public String getTmajor() {
        return tmajor;
    }

    public void setTmajor(String tmajor) {
        this.tmajor = tmajor;
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }
}