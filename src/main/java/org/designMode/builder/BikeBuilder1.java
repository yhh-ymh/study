package org.designMode.builder;

import org.designMode.dto.Bike;

/**
 * @description 设计模式 - 建造者模式 - 类型1
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
public class BikeBuilder1 extends Builder{
    Bike bike = new Bike();
    @Override
    public void setName() {
        bike.setName("bike1");
    }

    @Override
    public void setType() {
        bike.setType("type1");
    }

    @Override
    public Bike createBike() {
        return this.bike;
    }
}
