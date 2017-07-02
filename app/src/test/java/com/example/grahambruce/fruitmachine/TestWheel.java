package com.example.grahambruce.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static com.example.grahambruce.fruitmachine.Symbol.BELL;
import static junit.framework.Assert.assertEquals;

/**
 * Created by grahambruce on 30/06/2017.
 */

public class TestWheel {

    Wheel wheel;

    @Before
    public void Before() {
        wheel = new Wheel();
    }

    @Test
    public void testWheelSize() throws Exception {
        assertEquals(8, wheel.getWheelSize());
    }

    @Test
    public void testGetSpinResult() throws Exception {
        Wheel.spin();
        assertEquals(BELL, Wheel.getSpinResult());
    }
}

