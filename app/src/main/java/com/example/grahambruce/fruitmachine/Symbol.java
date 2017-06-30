package com.example.grahambruce.fruitmachine;

/**
 * Created by grahambruce on 30/06/2017.
 */

public enum Symbol {
    CHERRY(1),
    SEVEN(2),
    BAR(3),
    BELL(4),
    DIAMOND(5),
    LEMON(6),
    HORSESHOE(7),
    JACKPOT(10);

    int value;

    Symbol(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
