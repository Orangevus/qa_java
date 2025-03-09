package com.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatForFelineReturnPredatorEat() throws Exception {
        String[] expectedResult = new String[]{"Животные", "Птицы", "Рыба"};
        assertArrayEquals(expectedResult, feline.eatMeat().toArray());
    }

    @Test
    public void getFamilyForFelineReturnFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }
}
