package com.cn.hnust.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userTel;

    private Integer userLevelId;

    private Integer userWayId;

    private Integer userAvatarId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    public Integer getUserWayId() {
        return userWayId;
    }

    public void setUserWayId(Integer userWayId) {
        this.userWayId = userWayId;
    }

    public Integer getUserAvatarId() {
        return userAvatarId;
    }

    public void setUserAvatarId(Integer userAvatarId) {
        this.userAvatarId = userAvatarId;
    }
}