package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test(groups = { "checkintest" })
    public void souldBeAmount0() {
        assertEquals(cashback.remain(0),1000);
    }

    @Test(groups = { "checkintest" })
    public void souldBeAmount1() {
        assertEquals(cashback.remain(1),999);
    }

    @Test(groups = { "checkintest" })
    public void souldBeAmount999() {
        assertEquals(cashback.remain(999),1);
    }

    @Test(groups = { "checkintest" })
    public void souldBeAmount1000() {
        assertEquals(cashback.remain(1000),0);
    }

    @Test(groups = { "checkintest" })
    public void souldBeAmount1010() {
        assertEquals(cashback.remain(1001),999);
    }
}