package com.cn.hnust.pojo;

import java.util.Date;

public class Area {
    private Integer areaId;

    private String areaStuatus;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String areaName;

    private Integer areaParentid;

    private String updateUser;

    private Integer areaLeval;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaStuatus() {
        return areaStuatus;
    }

    public void setAreaStuatus(String areaStuatus) {
        this.areaStuatus = areaStuatus == null ? null : areaStuatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaParentid() {
        return areaParentid;
    }

    public void setAreaParentid(Integer areaParentid) {
        this.areaParentid = areaParentid;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Integer getAreaLeval() {
        return areaLeval;
    }

    public void setAreaLeval(Integer areaLeval) {
        this.areaLeval = areaLeval;
    }
}