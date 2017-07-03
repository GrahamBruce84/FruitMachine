package com.example.grahambruce.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static com.example.grahambruce.fruitmachine.Symbol.SEVEN;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 * Created by grahambruce on 30/06/2017.
 */


public class TestFruitMachine {

    FruitMachine fruitMachine;
    Wheel wheel;

    @Before
    public void before(){
        wheel = new Wheel();
        fruitMachine = new FruitMachine();
    }

    @Test
    public void testGetSpinResults() throws Exception {
        assertEquals(SEVEN, fruitMachine.getSpinResults());
    }
}
