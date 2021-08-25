package com.curso.varios;

public class EjemploArrays {
	
	
	public static void main(String[] args) {
		
		// array una dimension tipos primitivos
		
		int[] datos; //declaracion

		
		int[] notas = new int[20]; // decaración e inicialización
		
		datos = new int[4];       // array de 4 elementos int  0,0,0,0
		
		double[]  pesos = {3.4, 3.4};  // array de 2 doubles 3.4 y 3.4
		
	   pesos[0] = 4.5;
	   //pesos[2] = 8.0; // ArrayIndexOutOfBoundsException
	   
	   Punto[] figura = new Punto[4];   //  crear un obj array de cuatro posiciones inicializadas a null
	   
	   figura[0] = new Punto(3,7); //    direcc memoria a un objeto punto con las coord 3,7 , null, null, null
	   
	  // figura[1].getX();  //NullPointerException
	   
	   for(Punto p: figura) {
		   System.out.println(p);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
	}

}
