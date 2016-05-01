package com.cn.hnust.pojo;

import java.util.Date;

public class Img {
    private Integer imgId;

    private String imgUrl;

    private Float imgScore;

    private Date imgUpdatetime;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Float getImgScore() {
        return imgScore;
    }

    public void setImgScore(Float imgScore) {
        this.imgScore = imgScore;
    }

    public Date getImgUpdatetime() {
        return imgUpdatetime;
    }

    public void setImgUpdatetime(Date imgUpdatetime) {
        this.imgUpdatetime = imgUpdatetime;
    }
}