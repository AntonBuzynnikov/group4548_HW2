package org.example;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        GameObject b1 = new Building(200,150);
        GameObject h1 = new Hero(200,150,100,70);
        GameObject n1 = new Neutral(200,200);
        Render render = new Render();
        render.showIndicator(b1);
        render.showIndicator(h1);
        render.showIndicator(n1);
    }

    static class Render{
        public void showIndicator(Object object){
            if(object instanceof HaveHealth){
                System.out.println("Current health = "+((HaveHealth) object).getHealth());
                for (int i = 10; i <=((HaveHealth) object).getMaxHealth(); i+=10) {
                    if(i<=((HaveHealth) object).getHealth()){
                        System.out.print("\u2588");
                    }
                    else{
                        System.out.print("\u2591");
                    }
                }
                System.out.println();

            }
            if(object instanceof HaveMana){
                System.out.println("Current mana = "+((HaveMana) object).getMana());
                for (int i = 10; i <=((HaveMana) object).getMaxMana(); i+=10) {
                    if(i<=((HaveMana) object).getMana()){
                        System.out.print("\u2588");
                    }
                    else{
                        System.out.print("\u2591");
                    }
                }
                System.out.println();
            }
        }

    }

}