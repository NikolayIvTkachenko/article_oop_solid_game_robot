package org.example.article_oop_solid.oop_part_01;

import java.util.Date;
import java.util.UUID;

public abstract class  BaseRobot {
    Integer xPosition;

    Integer yPosition;

    UUID uuid;

    Integer serialNumber;

    Date dataIssue;

    Integer power;

    Integer shield;

    public abstract Integer moveX(Integer xStep);

    public abstract Integer moveY(Integer yStep);
}
