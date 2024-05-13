package org.designMode.plant;

import org.designMode.dto.Bike;

/**
 * @description 设计模式 - 抽象工厂模式 - 工厂2
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
public class Plant2 implements Plant {
    @Override
    public Bike createBike() {
        Bike bike = new Bike();
        bike.setName("bike2");
        bike.setType("bike2");
        return bike;
    }
}
