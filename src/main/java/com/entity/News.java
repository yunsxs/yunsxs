package com.entity;

public class News {
    private int news_id;
    private NewsType type;
    private String up;
    private String substance;
    private String news_title;
    private String second_title;
    private String reg_time;
    private String news_detail;

    public int getNews_id() {
        return news_id;
    }

    public NewsType getType() {
        return type;
    }

    public String getUp() {
        return up;
    }

    public String getSubstance() {
        return substance;
    }

    public String getNews_title() {
        return news_title;
    }

    public String getSecond_title() {
        return second_title;
    }

    public String getReg_time() {
        return reg_time;
    }

    public String getNews_detail() {
        return news_detail;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public void setType(NewsType type) {
        this.type = type;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public void setSecond_title(String second_title) {
        this.second_title = second_title;
    }

    public void setReg_time(String reg_time) {
        this.reg_time = reg_time;
    }

    public void setNews_detail(String news_detail) {
        this.news_detail = news_detail;
    }

    @Override
    public String toString() {
        return "News{" +
                "news_id=" + news_id +
                ", type=" + type +
                ", up='" + up + '\'' +
                ", substance='" + substance + '\'' +
                ", news_title='" + news_title + '\'' +
                ", second_title='" + second_title + '\'' +
                ", reg_time='" + reg_time + '\'' +
                ", news_detail='" + news_detail + '\'' +
                '}';
    }
}
