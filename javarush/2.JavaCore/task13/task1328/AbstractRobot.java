package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable{

    private String name;
    private static int hitCount;

    public String getName() {
            return name;
    }

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 5) {
            attackedBodyPart = BodyPart.LEG;
        }else if (hitCount == 7) {

            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 2) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 4) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 6) {
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount == 8) {
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}
