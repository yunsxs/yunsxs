package com.entity;

public class Rule {
    private int rule_id;
    private String rule_msg;
    private int rule_plus;

    public void setRule_id(int rule_id) {
        this.rule_id = rule_id;
    }

    public void setRule_msg(String rule_msg) {
        this.rule_msg = rule_msg;
    }

    public void setRule_plus(int rule_plus) {
        this.rule_plus = rule_plus;
    }

    public int getRule_id() {
        return rule_id;
    }

    public String getRule_msg() {
        return rule_msg;
    }

    public int getRule_plus() {
        return rule_plus;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "rule_id=" + rule_id +
                ", rule_msg='" + rule_msg + '\'' +
                ", rule_plus=" + rule_plus +
                '}';
    }
}
