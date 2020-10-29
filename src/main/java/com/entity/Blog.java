package com.entity;

public class Blog {
    private int blogid = 0;
    private int userid = 0;
    private String content = null;
    private String pictures = null;
    private String time = null;

    private User user;

    public void setBlogid(int blogid) {
        this.blogid = blogid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBlogid() {
        return blogid;
    }

    public int getUserid() {
        return userid;
    }

    public String getContent() {
        return content;
    }

    public String getPictures() {
        return pictures;
    }

    public String getTime() {
        return time;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogid=" + blogid +
                ", userid=" + userid +
                ", content='" + content + '\'' +
                ", picture='" + pictures + '\'' +
                ", time='" + time + '\'' +
                ", user=" + user +
                '}';
    }
}
