package com.company.characters;

import java.util.Random;

public class Jotaro extends Stand_Users{

    private int oraCritical;

    public Jotaro(int health, int damage, int oraCritical) {
        super(health, damage, All_Stand.STAR_PLATINUM );
        this.oraCritical = oraCritical;
    }

    public int getOraCritical() {
        return oraCritical;
    }

    public void setOraCritical(int oraCritical) {
        this.oraCritical = oraCritical;
    }

    @Override
    public void applyStandPower(Kira_Yoshikage kira_yoshikage, Stand_Users[] stand_users) {

        Random r = new Random();
       int koeff = r.nextInt(9) * 15;
       kira_yoshikage.setHealth(kira_yoshikage.getHealth() - koeff);
        System.out.println("ORA ORA ORA ORA ORA!!!Джотаро нанес крид.урон:" + koeff );

    }
}
