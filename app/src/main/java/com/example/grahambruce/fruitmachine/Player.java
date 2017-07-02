package com.example.grahambruce.fruitmachine;

/**
 * Created by grahambruce on 30/06/2017.
 */

public class Player {

    private int money;

    public Player(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int putMoneyIn(){
        return money -= 1;
    }


}
