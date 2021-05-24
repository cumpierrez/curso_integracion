package org.gobcan.prueba.Integraciones;

public class Menu {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int elemento1 = 100;
		int elemento2 = 12;
		System.out.println("La suma es " + App.suma(elemento1, elemento2));
		System.out.println("La resta es " + Operaciones.resta(elemento1, elemento2));
		System.out.println("La multiplicacion es " + Operaciones.multiplicacion(elemento1, elemento2));
		System.out.println("La division es " + Operaciones.division(elemento1, elemento2));
	}

}
