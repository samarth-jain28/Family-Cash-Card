package com.example.cashcard;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CashCardJsonTest {
    @Test
    void myFirstTest(){
        CashCard calc = new CashCard(); 
        Double expected = 20.2;
        Double actual = calc.area(2d);
        assertEquals(expected, actual);
    }
    
}
