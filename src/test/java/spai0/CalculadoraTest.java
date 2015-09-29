package spai0;

import spai0.Calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    
    Calculadora calc;

    @Before
    public void Before () {
        calc = new Calculadora(2, 2);
    }
    
    @Test
    public void TestSumar() {
        assertEquals(4, calc.sumar());
        assertEquals(26, calc.sumar(21, 5));
    }
    
}
