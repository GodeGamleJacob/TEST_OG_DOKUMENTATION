package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void f() {
        Main main = new Main();
        int resultat = main.f(8);
        assertEquals(8, resultat);

    }
}