package com.company.characters;

public abstract class Stand_Users extends Game_Entity implements UseStand {

    private All_Stand stand;

    public All_Stand getStand() {
        return stand;
    }

    public void setStand(All_Stand stand) {
        this.stand = stand;
    }

    public Stand_Users(int health, int damage, All_Stand stand) {
        super(health, damage);
        this.stand = stand;
    }
}
