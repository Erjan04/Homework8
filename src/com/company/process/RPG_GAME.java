package com.company.process;

import com.company.characters.*;

public class RPG_GAME {

        public static void start() {

                Kira_Yoshikage kira_yoshikage = new Kira_Yoshikage(700, 100);
                Jotaro jotaro = new Jotaro(300,20, 15);
                Josuke josuke = new Josuke(300, 20, 5);
                Koichi koichi = new Koichi(200, 15, 10);

                Stand_Users[] stand_users = {jotaro, josuke, koichi};

                fightInfo(kira_yoshikage, stand_users);


        while (!isFinished(kira_yoshikage, stand_users)){
                round(kira_yoshikage, stand_users);
        }

        }

        private static void fightInfo(Kira_Yoshikage kira_yoshikage, Stand_Users[] stand_users){
                System.out.println("_____________");
                System.out.println("Здоровья Киры:" + kira_yoshikage.getHealth());
                for (int i = 0; i < stand_users.length; i++) {
                        System.out.println(stand_users[i].getClass().getSimpleName() + " здоровья:" + stand_users[i].getHealth());
                }

                System.out.println("_____________");


        }

        private static void round(Kira_Yoshikage kira_yoshikage, Stand_Users[] stand_users){
                bossHit(kira_yoshikage,stand_users);
                heroesHit(kira_yoshikage,stand_users);
                standAbility(kira_yoshikage, stand_users);
                fightInfo(kira_yoshikage, stand_users);




        }

        private static boolean isFinished(Kira_Yoshikage kira_yoshikage, Stand_Users[] stand_users){

                for (int i = 0; i < stand_users.length; i++) {
                        if (kira_yoshikage.getHealth() - stand_users[i].getDamage() < 0) {
                                kira_yoshikage.getHealth();
                                if (kira_yoshikage.getHealth() <= 0) {
                                        System.out.println("Команда несокрушимых алмазов победила!!!");
                                        return true;
                                }
                        }
                        }

                boolean allStandoUsersDied = true;
                for (int i = 0; i < stand_users.length; i++) {
                        if (stand_users[i].getHealth() > 0 ){
                            if (stand_users[i].getHealth() <= 0)
                            return false;
                                allStandoUsersDied = false;
                                break;
                        }


                }

                if (allStandoUsersDied){
                        System.out.println("Кира Йошикаге выиграл ахахаахах!");
                }
                return allStandoUsersDied;
        }


        private static void bossHit(Kira_Yoshikage kira_yoshikage, Stand_Users[] stand_users) {
                for (int i = 0; i < stand_users.length; i++) {
                        if (stand_users[i].getHealth() > 0 && kira_yoshikage.getHealth() > 0){
                                stand_users[i].setHealth(stand_users[i].getHealth());
                        }
                        if (stand_users[i].getHealth() > 0) {
                                stand_users[i].setHealth(stand_users[i].getHealth() - kira_yoshikage.getDamage());
                        }
                }
        }

        private static void heroesHit(Kira_Yoshikage kira_yoshikage, Stand_Users[] stand_users){

                for (int i = 0; i < stand_users.length; i++) {
                        if (kira_yoshikage.getHealth() > 0 && stand_users[i].getHealth() > 0){
                                kira_yoshikage.setHealth(kira_yoshikage.getHealth());
                        }
                        if (kira_yoshikage.getHealth() > 0){
                                kira_yoshikage.setHealth(kira_yoshikage.getHealth() - stand_users[i].getDamage());

                        }else {
                                if (kira_yoshikage.getHealth() - stand_users[i].getDamage() <= 0){
                                }
                        }

                }


        }

        private static void standAbility(Kira_Yoshikage kira_yoshikage, Stand_Users[] stand_users){
                for (int i = 0; i < stand_users.length; i++) {
                        stand_users[i].applyStandPower(kira_yoshikage, stand_users);
                }


        }//никак не смог сделать хп босса 0,всегда меньше нуля получается


}
