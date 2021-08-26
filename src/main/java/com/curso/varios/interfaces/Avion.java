package com.curso.varios.interfaces;

import java.util.Date;

public class Avion extends Vehiculo 
				implements  Programable, Volable
   {

	@Override
	public void aterrizar() {
		System.out.println("Aterrizo como avión");
		
	}

	@Override
	public void despegar() {
		System.out.println("Despego como avión");
		
	}

	@Override
	public void volar() {
		System.out.println("Vuelo como avión");
		
	}

	@Override
	public void programar(Date fechaPlanificada) {
		System.out.println("El vuelo sale el día " + fechaPlanificada);
		
	}
	
	@Override
	public void volarAlturaMinima() {
		// TODO Auto-generated method stub
		Volable.super.volarAlturaMinima();
		// lo mio
		Volable.convertirMetrosEnPies(222);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public static void saluda() {
		System.out.println("hola");
	}

	
}
