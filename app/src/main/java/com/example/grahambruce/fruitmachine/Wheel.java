package com.example.grahambruce.fruitmachine;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by grahambruce on 30/06/2017.
 */

public class Wheel {

    Symbol symbol;
    ArrayList<Symbol> barrel;

    public Wheel() {
        this.barrel = new ArrayList<Symbol>();
        populate();
    }

    public int getSymbolValue() {
        return this.symbol.getValue();
    }

    public void populate() {
        for (Symbol symbol : Symbol.values()) {
            barrel.add(symbol);
        }
    }

    public int getBarrelSize(){
        return barrel.size();
    }

    public void spin(){
        Collections.shuffle(barrel);
    }
}

