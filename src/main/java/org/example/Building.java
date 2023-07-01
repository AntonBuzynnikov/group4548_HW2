package org.example;

public class Building extends GameObject implements HaveHealth{


    public Building(int maxHealthPoint, int currentHealthPoint) {
        super(maxHealthPoint, currentHealthPoint);
    }

    @Override
    public int getHealth() {
        return this.currentHealthPoint;
    }

    @Override
    public int getMaxHealth() {
        return this.maxHealthPoint;
    }
}
