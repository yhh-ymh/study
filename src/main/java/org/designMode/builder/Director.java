package org.designMode.builder;

import org.designMode.dto.Bike;

/**
 * @description 设计模式 - 建筑者模式 - 建造者
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
public class Director {
    public Builder builder;
    public Director(Builder builder) {
        this.builder =builder;
    }

    public Bike construct(){
        builder.setName();
        builder.setType();
        return builder.createBike();
    }

}
