package com.example.grahambruce.fruitmachine;

import java.util.ArrayList;

/**
 * Created by grahambruce on 30/06/2017.
 */

public class FruitMachine {

    Player player;
    Wheel barrel1;
    Wheel barrel2;
    Wheel barrel3;
    ArrayList<Symbol> spinResults;

    public FruitMachine(){
        this.player = new Player(10);
        this.barrel1 = new Wheel();
        this.barrel2 = new Wheel();
        this.barrel3 = new Wheel();
        spinWheels();
    }

    public void spinWheels(){
        this.barrel1.spin();
        this.barrel2.spin();
        this.barrel3.spin();
    }



}
