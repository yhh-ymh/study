package org.designMode.plant;

import org.designMode.dto.Bike;

/**
 * @description 设计模式 - 抽象工厂模式 - 工厂接口
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
public interface Plant {
    public Bike createBike();
}
