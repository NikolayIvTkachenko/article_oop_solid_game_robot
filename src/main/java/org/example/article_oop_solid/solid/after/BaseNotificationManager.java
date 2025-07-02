package org.example.article_oop_solid.solid.after;

import org.example.article_oop_solid.solid.before.BaseRobot;
import org.example.article_oop_solid.solid.before.MilitaryRobot;
import org.example.article_oop_solid.solid.before.TransportRobot;
import org.example.article_oop_solid.solid.before.UtilityRobot;

public abstract class BaseNotificationManager {

    protected abstract void sendMessage(String... message);

    public void prepareAndSendMessage(BaseRobot robot) {
        if(robot instanceof TransportRobot) {
            TransportRobot item = (TransportRobot) robot;
            String messagePosition = "X: " + item.getxPosition() + " , Y: " + item.getyPosition();
            String messageData = "UUID: " + item.getUuid() + " , weight point: " + item.getCargoWeight()
                    + " , power: " + item.getPower() + " , shield: " + item.getShield();
            sendMessage(messagePosition, messageData);
        } else if (robot instanceof MilitaryRobot) {
            MilitaryRobot item = (MilitaryRobot) robot;
            String messagePosition = "X: " + item.getxPosition() + " , Y: " + item.getyPosition();
            String messageData = "UUID: " + item.getUuid() + " , attack point: " + item.getAttack()
                    + " , power: " + item.getPower() + " , shield: " + item.getShield();
            sendMessage(messagePosition, messageData);
        } else if (robot instanceof UtilityRobot) {
            UtilityRobot item = (UtilityRobot) robot;
            String messagePosition = "X: " + item.getxPosition() + " , Y: " + item.getyPosition();
            String messageData = "UUID: " + item.getUuid() + " , repair point: " + item.getRepairPointShield()
                    + " , power: " + item.getPower() + " , shield: " + item.getShield();
            sendMessage(messagePosition, messageData);
        }
    }
}
