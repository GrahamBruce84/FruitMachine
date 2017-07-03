package com.example.grahambruce.fruitmachine;

/**
 * Created by grahambruce on 02/07/2017.
 */

public class Game {

    Player player;
    FruitMachine fruitMachine;
    Wheel wheel;

    public void playGame(){
        player.getMoney();
        player.putMoneyIn();
        fruitMachine.getSpinResults();
        fruitMachine.checkForWin();

    }
}
