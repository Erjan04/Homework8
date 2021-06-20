package com.company.characters;

import java.util.Random;

public class Koichi extends Stand_Users{

    private int actFri;

    public int getActFri() {
        return actFri;
    }

    public void setActFri(int actFri) {
        this.actFri = actFri;
    }

    public Koichi(int health, int damage, int actFri) {
        super(health, damage, All_Stand.Echos);
        this.actFri = actFri;
    }


    @Override
    public void applyStandPower(Kira_Yoshikage kira_yoshikage, Stand_Users[] stand_users) {

        Random r2 = new Random();
        int cf = r2.nextInt(2) * 3;
        kira_yoshikage.setHealth(kira_yoshikage.getHealth() - actFri * cf);
        System.out.println("G.O.V.N.O.....Коичи нанес супер удар:" + actFri * cf);
        }



    }



