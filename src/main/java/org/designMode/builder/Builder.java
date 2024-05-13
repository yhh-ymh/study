package org.designMode.builder;

import org.designMode.dto.Bike;

/**
 * @description 设计模式 - 建造者模式 - 建造者
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
public abstract class Builder {
    public abstract void setName();
    public abstract void setType();
    public abstract Bike createBike();
}
