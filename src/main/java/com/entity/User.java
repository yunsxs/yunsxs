package com.entity;

public class User {
    private int userid;
    private String username;
    private String userrname;
    private String password;
    private int userlevel;
    private int userscore;
    private String phonenumber;

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getUserrname() {
        return userrname;
    }

    public String getPassword() {
        return password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getUserlevel() {
        return userlevel;
    }

    public int getUserscore() {
        return userscore;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserrname(String userrname) {
        this.userrname = userrname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserlevel(int userlevel) {
        this.userlevel = userlevel;
    }

    public void setUserscore(int userscore) {
        this.userscore = userscore;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userrname='" + userrname + '\'' +
                ", password='" + password + '\'' +
                ", userlevel=" + userlevel +
                ", userscore=" + userscore +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
