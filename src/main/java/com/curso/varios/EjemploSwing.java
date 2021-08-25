package com.curso.varios;



public class EjemploSwing {
	
	public enum Modelo {DELUXE, ESTANDAR, POBRETON, OTRO}
	
	public static void main(String[] args) {
		
		Modelo m = Modelo.OTRO;
		switch(m) {
		default:
			System.out.println("rueda");
			System.out.println("motor");
		case DELUXE:
			System.out.println("aire acondi");
			System.out.println("radio");
			System.out.println("rueda");
			System.out.println("motor");
			//break;
		case ESTANDAR:
			System.out.println("radio");
			System.out.println("rueda");
			System.out.println("motor");
			//break;
		
		}//fin switch
	}

}
