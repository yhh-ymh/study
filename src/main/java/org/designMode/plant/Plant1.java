package org.designMode.plant;

import org.designMode.dto.Bike;

/**
 * @description 设计模式 - 抽象工厂模式 - 工厂1
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
public class Plant1 implements Plant {
    @Override
    public Bike createBike() {
        Bike bike = new Bike();
        bike.setName("bike1");
        bike.setType("bike1");
        return bike;
    }
}
