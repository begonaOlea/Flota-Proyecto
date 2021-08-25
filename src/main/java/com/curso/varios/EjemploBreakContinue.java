package com.curso.varios;

public class EjemploBreakContinue {

	
	
	public static void main(String[] args) {
		
		/*
		 *  1.  while  imprimir los numeros del 1 al 20   
		 */
		
		System.out.println("... caso 1");
		int contador = 1;
		while(contador < 21) {
			System.out.println(contador ++);
		}
		
		/*
		 *  2.  while imprimir los numeros del 1 al 20 y para cada uno de ellos mostras 
		 *      si es par o impar
		 */
		
		System.out.println("... caso 2");
		int contador2 = 1;
		while(contador2 < 21) {
			System.out.print(contador2);
			if(contador2 % 2 == 0) {
				System.out.println(" par");
			}else {
				System.out.println(" impar");
			}
			contador2 ++;
		}
		
		
		/*
		 *  3.  While imprimir los numeros del 1 al 20 y para cada uno de ellos mostras 
		 *      si es par o impar . Pero si el numero es el 7 saltar el paso de decir si
		 *      es par o impar
		 */
		

		System.out.println("... caso 3");
		int contador3 = 1;
		while(contador3 < 21) {
			System.out.print(contador3);
			if( contador3 == 7) {
				System.out.println("");
				contador3 ++;
				continue;
			}
			if(contador3 % 2 == 0) {
				System.out.println(" par");
			}else {
				System.out.println(" impar");
			}
			contador3 ++;
		}
		
		/*
		 *  4.   con form 5 veces mostrar las letras de la A a la F.
		 */
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
			}
			System.out.println();
		}
		
		// break sin etiqueta
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
				if(l == 'E') break;  //salta linea 78
			}
			System.out.println();
		}
		
		System.out.println(".........");
		// break con etiqueta
		bucle1:
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
				if(l == 'E') break bucle1;  //salta linea 91
			}
			System.out.println();
		}
		
		System.out.println("......... contintue .... ");
		//continute  sin etiqueta
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
				if(l == 'E') continue;  //salta 96 no imprime *
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		System.out.println("......... contintue con eti.... ");
		//continute  sin etiqueta
		buclefuera:
		for(int i = 0 ; i < 5 ; i++) {
			for(int l = (byte) 'A'; l <= (byte)'F'; l++) {
				System.out.print((char)l);
				if(l == 'E') continue buclefuera;  //salta 108  no imprime salto delinea
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}
}
