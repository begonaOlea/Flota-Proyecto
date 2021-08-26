package com.curso.varios.interfaces;

import java.util.Comparator;

public interface Volable extends Comparator{
	
	// PUBLIC STATIC FINAL   - constantes
	public static final double  ALTURA_MINIMA_VUELO = 1000.0;
	
	// PUBLIC ABSTRACT  - métodos abstractos
	public  abstract void aterrizar();
	void despegar();  // es public y abstract
	public void volar(); // es public y abstract
	
	
	// JAVA 8
	// METODOS DEFAULT
	public default void  volarAlturaMinima() {
		//conexión a sistema .... 
		System.out.println("..... conecto sistemas para volar a " + ALTURA_MINIMA_VUELO);
	}
	
	
	// MÉTODOS ESTÁTICOS
	 public static  double convertirMetrosEnPies(double metros) {
		 //calculo
		 return metros / 1.1;
	 }

}


/*
 * 
 *      Volable.ALUTRA_MINIMA_VUELO
 *      Volable.convertirMetrosEnPies(metros)
 * 
 */
