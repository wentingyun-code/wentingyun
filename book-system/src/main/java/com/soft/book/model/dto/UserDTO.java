package com.soft.book.model.dto;

public class UserDTO {

    private String username;
    private String nickname;
    private String password;
    private String avatar;
    private Integer gender;

    public UserDTO(String username, String nickname, String password, String avatar, Integer gender) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.avatar = avatar;
        this.gender = gender;
    }
        public UserDTO() {}

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
}
