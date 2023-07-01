package org.example;

public class Hero extends GameObject implements HaveHealth, HaveMana{

    int maxMana;
    int currentMana;
    public Hero(int maxHealthPoint, int currentHealthPoint, int maxMana,
                int currentMana) {
        super(maxHealthPoint, currentHealthPoint);
        this.currentMana = currentMana;
        this.maxMana = maxMana;
    }
    public void setCurrentMana(int currentMana){
        this.currentMana = currentMana;
    }

    @Override
    public int getHealth() {
        return this.currentHealthPoint;
    }

    @Override
    public int getMaxHealth() {
        return this.maxHealthPoint;
    }

    @Override
    public int getMana() {
        return this.currentMana;
    }

    @Override
    public int getMaxMana() {
        return this.maxMana;
    }
}
