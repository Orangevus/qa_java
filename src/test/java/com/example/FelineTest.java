package com.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.mockito.Mockito;
import org.mockito.Spy;


public class FelineTest {
    Feline feline = new Feline();
    @Spy
    private Feline spyFeline;
    @Test
    public void getKittensWithNoParametersCallsGetKittens() {
        spyFeline = Mockito.spy(feline);
        spyFeline.getKittens();
        Mockito.verify(spyFeline).getKittens(1);
    }

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
