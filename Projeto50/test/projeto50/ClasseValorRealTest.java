/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package projeto50;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Wesley
 */
public class ClasseValorRealTest {
    
    public ClasseValorRealTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of mostrarDecimal method, of class ClasseValorReal.
     */
    @Test
    public void testMostrarDecimal() {
        System.out.println("mostrarDecimal");
        double valorDecimal = 2.5;
        ClasseValorReal instance = new ClasseValorReal();
        double expResult = 2;
        double result = instance.mostrarDecimal(valorDecimal);
        assertEquals(expResult, result, 0);
     
    }
    
}
