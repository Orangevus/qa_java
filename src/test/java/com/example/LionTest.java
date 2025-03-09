package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void lionUnknownSexThrowException() {
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        assertThrows(expectedMessage, Exception.class, () -> new Lion("Лев", feline));
    }

    @Test
    public void getKittensDefaultValue() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int defaultValue = 1;
        Mockito.when(feline.getKittens()).thenReturn(defaultValue);
        assertEquals(defaultValue, lion.getKittens());
    }

    @Test
    public void getFoodForLionReturnPredatorEat() throws Exception {
        Lion lion = new Lion("Самка", feline);
        String[] expectedResult = new String[]{"Животные", "Птицы", "Рыба"};
        Mockito.when(feline.eatMeat()).thenReturn(List.of(expectedResult));
        assertArrayEquals(expectedResult, lion.getFood().toArray());
    }
}
