package com.example.grahambruce.fruitmachine;

import org.junit.Before;
import org.junit.Test;

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
    public void testBarrelSize() throws Exception {
        assertEquals(8, wheel.getBarrelSize());
    }
}

