package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {


    @Test
    public void testRemain() {
        int amount = 400;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 600;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainMore1000() {
        int amount = 1200;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 800;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1000() {
        int amount = 1000;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

}