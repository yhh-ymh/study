package org.designMode.plant;

import org.designMode.dto.Bike;

/**
 * @description
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
public class test {
    public static void main(String[] args) {
        Plant1 plant = new Plant1();
        Bike bike = plant.createBike();
        System.out.println(bike);

        Plant2 plant2 = new Plant2();
        Bike bike2 = plant2.createBike();
        System.out.println(bike2);
    }
}
