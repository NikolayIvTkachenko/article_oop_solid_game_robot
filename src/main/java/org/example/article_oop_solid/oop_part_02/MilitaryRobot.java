package org.example.article_oop_solid.oop_part_02;

import org.example.article_oop_solid.ConstantApp;

import java.util.Date;
import java.util.UUID;

public class MilitaryRobot extends BaseRobot {

    protected Integer attack;

    public MilitaryRobot(Integer xStart, Integer yStart, Integer serialNumber, Integer attack) {
        this.uuid = UUID.randomUUID();
        this.serialNumber = serialNumber;
        this.dataIssue = new Date();
        this.power = ConstantApp.getInstance().ROBOT_POWER_MILITARY;
        this.shield = ConstantApp.getInstance().ROBOT_SHIELD_MILITARY;
        this.xPosition = xStart;
        this.yPosition = yStart;
        this.attack = attack;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
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

    //В случае, если щиты объекта меньше 0, то объект разрушен и возвращается флаг true
    public boolean attack(BaseRobot item) {
        item.shield = item.shield - attack;
        return item.shield < 0;
    }
}
