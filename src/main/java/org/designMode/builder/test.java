package org.designMode.builder;

import org.designMode.dto.Bike;

/**
 * @description 设计模式 - 建造者模式 - 测试类
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
public class test {
    public static void main(String[] args) {
        Director director = new Director(new BikeBuilder1());
        Bike construct = director.construct();
        System.out.println(construct);
    }
}
