package org.example.article_oop_solid.solid.before;

import org.example.article_oop_solid.solid.after.ConstantApp;
import org.example.article_oop_solid.solid.after.MilitaryRobot;
import org.example.article_oop_solid.solid.after.NotificationManager;

public class GameManagement {

    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager();
        MilitaryRobot m1 = new MilitaryRobot( 5, 5, 1,
                ConstantApp.getInstance().ROBOT_MILITARY_ATTACK_POINTS*2);
        MilitaryRobot m2 = new MilitaryRobot( 5, 5, 1,
                ConstantApp.getInstance().ROBOT_MILITARY_ATTACK_POINTS);

        notificationManager.prepareAndSendMessage(m1);
        notificationManager.prepareAndSendMessage(m2);
    }
}