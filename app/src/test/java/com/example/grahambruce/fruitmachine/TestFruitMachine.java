package com.example.grahambruce.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static com.example.grahambruce.fruitmachine.Symbol.SEVEN;
import static org.mockito.Mockito.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by grahambruce on 30/06/2017.
 */


public class TestFruitMachine {

    FruitMachine fruitMachine;
    Wheel wheel;

    @Before
    public void before(){
        wheel = new Wheel();
    }

    @Test
    public void testGetSpinResults() throws Exception {
        fruitMachine.spinWheels();
        assertEquals(SEVEN, fruitMachine.getSpinResults());
    }




}
