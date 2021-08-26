package com.curso.flota.dominio;

public class Furgoneta extends Vehiculo{

	public Furgoneta(double cargaMaxima, String matricula) {
		super(cargaMaxima, matricula);
	}

	@Override
	public double calcularFuel() {
		
		return 100;
	}

}
