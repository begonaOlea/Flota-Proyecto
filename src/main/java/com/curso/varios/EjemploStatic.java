package com.curso.varios;

public class EjemploStatic {
	
	
	public static int counter;
	private int serialNumber;
	
	static { // una sola vez en la carga de la clase EjemploStatic   
		//  EjemploStatic.counter =3
	
		counter = Integer.getInteger("myApp.Count4.counter").intValue(); 
	
	}
	
		
	{  // cada vez que hago new de la clase EjemploStatic y lo llama antes de llamar al constructor
		//if( counter == 0) 
	
	    serialNumber = 1;
	}
	
	/*
	 *     java EjemploStatic
	 *     
	 *     java EjemploStatic  2 3 "Hola Mundo"
	 *     
	 *     java -DmyApp.Count4.counter=66  EjemploStatic
	 */
	public static void main(String[] args) {
		
		for(String arg : args) {
			System.out.println(arg);
		
		System.out.println("counter = "+ EjemploStatic.counter);
	}
	



}
