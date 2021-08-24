package com.curso.varios;

public class PruebasString {

	public static void main(String[] args) {
	
		
		//String  PoolString  ==  equals
		
		String s1 = "hola";
		String s2 = new String("hola");
		String s3 = "hola";
		
		//  == compara el contenido de la variable, es decir, la direc de memoria
		
		System.out.println(" s1 == s2 ? " + (s1 == s2));
		System.out.println(" s1 == s3 ? " + (s1 == s3));
		
		// equals() se emplea para comparar objetos no sus direcciones
		
		System.out.println(" s1 equals s2 ? " + (s1.equals(s2)));
		System.out.println(" s1 equals s3 ? " + (s1.equals(s3)));
		
		
		//Punto (x,y)  == equals
		
		

	}

}
