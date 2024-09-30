package com.soft.book.model.entity;

import java.util.Date;

public class User {

    private Integer id;
    private String username;
    private String nickname;
    private String password;
    private String avatar;
    private Integer gender;
    private Integer deleteFlag;
    private Date createTime;
    private Date updateTime;

    public User(Integer id, String username, String nickname, String password, String avatar, Integer gender, Integer deleteFlag, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.avatar = avatar;
        this.gender = gender;
        this.deleteFlag = deleteFlag;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender=" + gender +
                ", deleteFlag=" + deleteFlag +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public User() {

    }
}
