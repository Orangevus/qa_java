package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ManeTest {
    private final String sex;
    private final boolean expectedMane;

    public ManeTest(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeForSex() throws Exception {
        Lion lion = new Lion(sex, null);
        assertEquals(expectedMane, lion.doesHaveMane());
    }
}