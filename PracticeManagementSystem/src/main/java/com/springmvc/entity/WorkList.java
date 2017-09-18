package com.springmvc.entity;

public class WorkList {
    private Integer cid;

    private String cname;

    private String positon;

    private Integer salary;

    private Integer positionDescribeId;

    private Integer applicationNumber;

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

    public String getPositon() {
        return positon;
    }

    public void setPositon(String positon) {
        this.positon = positon;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getPositionDescribeId() {
        return positionDescribeId;
    }

    public void setPositionDescribeId(Integer positionDescribeId) {
        this.positionDescribeId = positionDescribeId;
    }

    public Integer getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(Integer applicationNumber) {
        this.applicationNumber = applicationNumber;
    }
}