package com.curso.flota.dominio;

public class Barcaza extends Vehiculo{

	public Barcaza(double cargaMaxima, String matricula) {
		super(cargaMaxima, matricula);
	}

	@Override
	public double calcularFuel() {
		return this.getCargaActual() * 45 ;
	}
}
