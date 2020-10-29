package com.entity;

public class Action {
    private int action_id;
    private int userid;
    private int rule_id;

    private User user;
    private Rule rule;

    public void setAction_id(int action_id) {
        this.action_id = action_id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public void setRule_id(int rule_id) {
        this.rule_id = rule_id;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getRule_id() {
        return rule_id;
    }

    public int getUserid() {
        return userid;
    }

    public int getAction_id() {
        return action_id;
    }

    public User getUser() {
        return user;
    }

    public Rule getRule() {
        return rule;
    }

    @Override
    public String toString() {
        return "Action{" +
                "action_id=" + action_id +
                ", user=" + user +
                ", rule=" + rule +
                '}';
    }
}
