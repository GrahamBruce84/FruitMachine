package com.example.grahambruce.fruitmachine;

import java.util.Collections;

/**
 * Created by grahambruce on 30/06/2017.
 */

public class FruitMachine {

    Player player;
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;

    public FruitMachine(Player player, Wheel wheel){
        this.player = new Player;
        this.wheel1 = new Wheel;
        this.wheel2 = new Wheel;
        this.wheel3 = new Wheel;
        spinWheels();
    }

    public void spinWheels(){
        this.wheel1.spin();
        this.wheel2.spin();
        this.wheel3.spin();
    }



}
