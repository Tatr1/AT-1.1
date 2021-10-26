package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void souldBeAmount0() {
        assertEquals(1000, cashback.remain(0));
    }

    @Test
    public void souldBeAmount1() {
        assertEquals(999, cashback.remain(1));
    }

    @Test
    public void souldBeAmount999() {
        assertEquals(1, cashback.remain(999));
    }

    @Test
    public void souldBeAmount1000() {
        assertEquals(0, cashback.remain(1000));
    }

    @Test
    public void souldBeAmount1010() {
        assertEquals(999, cashback.remain(1001));
    }

}