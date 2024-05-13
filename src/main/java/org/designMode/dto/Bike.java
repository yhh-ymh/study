package org.designMode.dto;

/**
 * @description 设计模式 - 实体类
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
public class Bike {

    private String name;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
