package com.zheye.common.pojo;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private String phone;

    private String password;

    private String site;

    private String appLoginToken;

    private Date birthday;

    private String card;

    @Email
    private String email;

    private String lastLoginIp;

    private Date loginDate;

    private String loginIp;

    @Size(max = 3)
    private String username;

    private Integer sex;

    private Integer status;

    private String description;

    private String introduce;

    private String trade;

    private String occupation;

    private String education;

    private Integer endorse;

    private Integer thank;

    private Integer collect;

    private Integer attention;

    private Integer befocused;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getAppLoginToken() {
        return appLoginToken;
    }

    public void setAppLoginToken(String appLoginToken) {
        this.appLoginToken = appLoginToken == null ? null : appLoginToken.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade == null ? null : trade.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Integer getEndorse() {
        return endorse;
    }

    public void setEndorse(Integer endorse) {
        this.endorse = endorse;
    }

    public Integer getThank() {
        return thank;
    }

    public void setThank(Integer thank) {
        this.thank = thank;
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Integer getBefocused() {
        return befocused;
    }

    public void setBefocused(Integer befocused) {
        this.befocused = befocused;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", site=").append(site);
        sb.append(", appLoginToken=").append(appLoginToken);
        sb.append(", birthday=").append(birthday);
        sb.append(", card=").append(card);
        sb.append(", email=").append(email);
        sb.append(", lastLoginIp=").append(lastLoginIp);
        sb.append(", loginDate=").append(loginDate);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", username=").append(username);
        sb.append(", sex=").append(sex);
        sb.append(", status=").append(status);
        sb.append(", description=").append(description);
        sb.append(", introduce=").append(introduce);
        sb.append(", trade=").append(trade);
        sb.append(", occupation=").append(occupation);
        sb.append(", education=").append(education);
        sb.append(", endorse=").append(endorse);
        sb.append(", thank=").append(thank);
        sb.append(", collect=").append(collect);
        sb.append(", attention=").append(attention);
        sb.append(", befocused=").append(befocused);
        sb.append("]");
        return sb.toString();
    }
}