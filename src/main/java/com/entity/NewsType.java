package com.entity;

import java.util.List;

public class NewsType {
    private int typeId;
    private String typeName;

    private List<News> children;

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setChildren(List<News> children) {
        this.children = children;
    }

    public List<News> getChildren() {
        return children;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return "NewsType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", children=" + children +
                '}';
    }
}
