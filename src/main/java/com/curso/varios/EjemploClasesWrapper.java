package com.curso.varios;

public class EjemploClasesWrapper {
	
	
	public static void main(String[] args) {
		
		
		Integer numero = 222; //outoboxin de int a un Integer
		
		Integer numero2 = 222; //Pool  -127 a 128
		
		System.out.println("comparo numero == numero2 ?" + (numero == numero2));
		System.out.println("comparo numero equals numero2 ?" + (numero.equals(numero2)));
		
		int i = 222;
		if (i == numero); //true
		if ( numero == 222); // true;
		
	}

}
