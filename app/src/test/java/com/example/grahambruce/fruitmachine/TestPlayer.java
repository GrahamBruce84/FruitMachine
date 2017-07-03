package com.example.grahambruce.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by grahambruce on 30/06/2017.
 */

public class TestPlayer {

    Player player;

    @Before
    public void before() throws Exception {
        player = new Player(10);
    }

    @Test
    public void testGetMoney() throws Exception {
        assertEquals(10, player.getMoney());

    }

    @Test
    public void testPutMoneyIn() throws Exception {
        player.getMoney();
        assertEquals(9, player.putMoneyIn());
    }
}
