package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        int amount = 400;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        int expected = 600;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainMore1000() {
        int amount = 1200;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain1000() {
        int amount = 1000;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }




}