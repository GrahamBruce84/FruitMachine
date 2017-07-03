package com.example.grahambruce.fruitmachine;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by grahambruce on 30/06/2017.
 */

public class Wheel {

    Symbol symbol;
    static ArrayList<Symbol> wheel;

    public Wheel() {
        wheel = new ArrayList<Symbol>();
        populate();
        spin();
    }

    public int getSymbolValue() {
        return this.symbol.getValue();
    }

    public void populate() {
        for (Symbol symbol : Symbol.values()) {
            wheel.add(symbol);
        }
    }

    public int getWheelSize(){
        return wheel.size();
    }

    public static void spin(){
        Collections.shuffle(wheel);
    }

    public static Symbol getSpinResult(){
        return wheel.get(0);
    }
}

