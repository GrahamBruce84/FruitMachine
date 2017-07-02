package com.example.grahambruce.fruitmachine;

import java.util.ArrayList;
import java.util.Arrays;

import static android.R.id.list;
import static com.example.grahambruce.fruitmachine.Wheel.getSpinResult;
import static com.example.grahambruce.fruitmachine.Wheel.spin;

/**
 * Created by grahambruce on 30/06/2017.
 */

public class FruitMachine {

    private Player player;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private ArrayList<Wheel> wheels;

    public FruitMachine() {
        this.player = new Player(10);
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wheel3 = new Wheel();
        this.wheels = new ArrayList<>(Arrays.asList(wheel1, wheel2, wheel3));

    }

    public void spinWheels() {
        for (Wheel wheel : wheels) {
            spin();
        }
    }

    public Symbol getSpinResults() {
        for (Wheel wheel : wheels) {
            getSpinResult();
        }
        return getSpinResults();
    }
}
