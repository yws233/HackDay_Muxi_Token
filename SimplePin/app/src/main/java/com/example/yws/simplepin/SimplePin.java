package com.example.yws.simplepin;

import android.util.Log;

import java.util.List;

/**
 * 聘小记实体类
 */

public class SimplePin {

    private String company; //公司
    private String category; //类别
    private String pingType; //招聘类型
    private String jobTitle; //岗位名称
    private String location; //发布时间
    private String time; //地点
    private String link; //连接
    private String email; //邮箱
    private String[] requireMents; //职位要求

    public SimplePin(String company, String category, String pingType, String jobTitle, String location, String time, String link, String email, String[] requireMents) {
        this.company = company;
        this.category = category;
        this.pingType = pingType;
        this.jobTitle = jobTitle;
        this.location = location;
        this.time = time;
        this.link = link;
        this.email = email;
        this.requireMents = requireMents;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPingType() {
        return pingType;
    }

    public void setPingType(String pingType) {
        this.pingType = pingType;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getRequireMents() {
        return requireMents;
    }

    public void setRequireMents(String[] requireMents) {
        this.requireMents = requireMents;
    }
}
