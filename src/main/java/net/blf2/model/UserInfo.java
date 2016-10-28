package net.blf2.model;

/**
 * Created by t_mengxh on 2016/10/28.
 */
public class UserInfo {
    private String userId;
    private String userEmail;
    private String userPassword;
    private String userNickName;
    private String userPhoto;
    private String userMainPage;
    private Integer userRule;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserMainPage() {
        return userMainPage;
    }

    public void setUserMainPage(String userMainPage) {
        this.userMainPage = userMainPage;
    }

    public Integer getUserRule() {
        return userRule;
    }

    public void setUserRule(Integer userRule) {
        this.userRule = userRule;
    }
}
