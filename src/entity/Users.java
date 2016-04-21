package entity;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by JN on 2016/4/20.
 */
//java信息表
public class Users {
    private int sid;
    private String username;
    private String mypassword;
    private String email;
    private String gender;
    private String introduce;
    private Date birthday;

    public Users(int sid,String username, String mypassword, String email, String gender, String introduce, Date birthday) {
        this.sid = sid;
        this.username = username;
        this.mypassword = mypassword;
        this.email = email;
        this.gender = gender;
        this.introduce = introduce;
        this.birthday = birthday;
    }

    public int getSid() {
        return sid;
    }

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", mypassword='" + mypassword + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", introduce='" + introduce + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMypassword() {
        return mypassword;
    }

    public void setMypassword(String mypassword) {
        this.mypassword = mypassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
