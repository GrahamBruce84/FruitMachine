package com.example.grahambruce.fruitmachine;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by grahambruce on 30/06/2017.
 */

public class Wheel {

    Symbol symbol;
    static ArrayList<Symbol> Wheel;

    public Wheel() {
        Wheel = new ArrayList<>();
        populate();
    }

    public int getSymbolValue() {
        return this.symbol.getValue();
    }

    public void populate() {
        for (Symbol symbol : Symbol.values()) {
            Wheel.add(symbol);
        }
    }

    public int getWheelSize(){
        return Wheel.size();
    }

    public static void spin(){
        Collections.shuffle(Wheel);
    }

    public static Symbol getSpinResult(){
        return Wheel.get(0);
    }
}

