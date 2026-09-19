package org.example.article_oop_solid.oop_part_01;

import org.example.article_oop_solid.ConstantApp;

import java.util.Date;
import java.util.UUID;

public class TransportRobot extends BaseRobot  {

    Integer cargoWeight;

    public TransportRobot(Integer xStart, Integer yStart, Integer serialNumber) {
        this.uuid = UUID.randomUUID();
        this.dataIssue = new Date();
        this.serialNumber = serialNumber;
        this.power = ConstantApp.getInstance().ROBOT_POWER_TRANSPORT;
        this.shield = ConstantApp.getInstance().ROBOT_SHIELD_TRANSPORT;
        this.xPosition = xStart;
        this.yPosition = yStart;
        this.cargoWeight = 0;
    }

    @Override
    public Integer moveX(Integer xStep) {
        //Обработка перемещения по оси X
        return 0;
    }

    @Override
    public Integer moveY(Integer yStep) {
        //Обработка перемещений по оси У
        return 0;
    }

    //Метод загрузки
    public boolean loadingCargo() {
        if (this.power == ConstantApp.getInstance().ROBOT_POWER_TRANSPORT) {
            this.power = 0;
            this.cargoWeight = ConstantApp.getInstance().ROBOT_TRANSPORT_WEIGHT_POINTS;
            return true;
        }
        return false;
    }

    //Метод разгрузки
    public boolean unloadingCargo() {
        if (this.power == ConstantApp.getInstance().ROBOT_POWER_TRANSPORT) {
            this.power = 0;
            this.cargoWeight = 0;
            return true;
        }
        return false;
    }
}
