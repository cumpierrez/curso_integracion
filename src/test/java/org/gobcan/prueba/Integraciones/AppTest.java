package org.gobcan.prueba.Integraciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.gobcan.prueba.Integraciones.App;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
    @Test
    public void pruebaDeSumaTest()
    {
        assertEquals("La suma ha dejado de ser correcta", 20, App.suma(10, 10));
    }
    
    @Test
    public void pruebaDeSumaTest2()
    {
        assertNotEquals("La suma ha dejado de ser correcta", 10000, App.suma(100, 100));
    	assertEquals("La suma ha dejado de ser correcta", 30, App.suma(20, 10) );
    	
    }
    
    @Test
    public void pruebaDeSumaTest3()
    {
        assertEquals("La suma ha dejado de ser correcta", 4, App.suma(2, 2));
    }
    
    @Test
    public void pruebaDeSumaTest4()
    {
        assertEquals("La suma ha dejado de ser correcta", -1, App.suma(0, 0));
    }    
}
