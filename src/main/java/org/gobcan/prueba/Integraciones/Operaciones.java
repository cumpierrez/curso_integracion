package org.gobcan.prueba.Integraciones;

/**
 * Hello world!
 *
 */
public class Operaciones 
{
	
	public static int resta(int a, int b) 
	{
            return a-b;
	}
	public static int multiplicacion(int a, int b) 
	{
            return a*b;
	}
	public static int division(int a, int b) 
	{
		try {
			return a/b;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			return a;
					}
}    
}
