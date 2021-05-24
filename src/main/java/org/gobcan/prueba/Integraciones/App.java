package org.gobcan.prueba.Integraciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{

	public final static Logger logger = Logger.getLogger("org.gobcan.prueba.testprueba.App");
	
	public static int suma(int a, int b) 
	{
        if ((a == 0) && (b ==0)) {
            return -1; 
        }
        else
            return a+b;
	}
	
	public Integer suma2(Integer numero1, Integer numero2)
	{
		//numero2 = null;
		return numero1.intValue() + numero2.intValue();
	}
	
    public static void main( String[] args )
    {
    	logger.log(Level.INFO, "Hello World!" );
    	logger.log(Level.INFO, "La suma del 10 con el 35 es {0}", suma(10,35) );
    }
    
}
