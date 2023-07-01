package org.example;

public abstract class GameObject {
    int maxHealthPoint;
    int currentHealthPoint;

    public GameObject(int maxHealthPoint, int currentHealthPoint){
        this.currentHealthPoint = currentHealthPoint;
        this.maxHealthPoint = maxHealthPoint;
    }
    public void setCurrentHealthPoint(int currentHealthPoint){
        this.currentHealthPoint = currentHealthPoint;
    }
}
