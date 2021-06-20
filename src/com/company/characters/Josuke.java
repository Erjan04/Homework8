package com.company.characters;

import java.util.Random;

public class Josuke extends Stand_Users {

    private int doRaPoint;

    public Josuke(int health, int damage, int doRaPoint) {
        super(health, damage, All_Stand.CRAZY_DIAMOND);
        this.doRaPoint = doRaPoint;
    }

    public int getDoRaPoint() {
        return doRaPoint;
    }

    public void setDoRaPoint(int doRaPoint) {
        this.doRaPoint = doRaPoint;
    }

    public Josuke(int health, int damage) {
        super(health, damage, All_Stand.CRAZY_DIAMOND);
    }

    @Override
    public void applyStandPower(Kira_Yoshikage kira_yoshikage, Stand_Users[] stand_users) {
        Random r1 = new Random();
        int cof = r1.nextInt(3) * 5;
        for (int i = 0; i < stand_users.length; i++) {
            if (stand_users[i].getStand().equals(All_Stand.CRAZY_DIAMOND)) {
            }
            kira_yoshikage.setHealth(kira_yoshikage.getHealth() - doRaPoint * cof);
        }
        System.out.println("ШИКАРНО...Джоске поднял урон на:" + doRaPoint * cof);
    }
}
