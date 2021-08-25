package com.curso.flota.dominio;

public class Camion extends Vehiculo{

	private int numEjes;

	public Camion(double cargaMaxima, String matricula, int numEjes) {
		super(cargaMaxima, matricula);
		this.numEjes  = numEjes;
	}
	
	@Override
	public double calcularFuel() {
		
		return  this.getCargaActual() * 30 + 2 * numEjes;
	}

}
