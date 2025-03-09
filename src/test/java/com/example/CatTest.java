package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundForCatReturnMeow() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodForCatReturnPredatorEat() throws Exception {
        Cat cat = new Cat(feline);
        String[] catFood = new String[]{"Кошачий корм", "Консервы", "Молоко"};
        Mockito.when(feline.eatMeat()).thenReturn(List.of(catFood));
        assertArrayEquals(catFood, cat.getFood().toArray());
    }
}
