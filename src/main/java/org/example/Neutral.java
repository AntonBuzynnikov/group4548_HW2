package org.example;

public class Neutral extends GameObject implements HaveHealth{
    public Neutral(int maxHealthPoint, int currentHealthPoint) {
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
