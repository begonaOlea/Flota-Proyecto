package com.curso.flota.dominio;

public class Camion extends Vehiculo{

	private int numEjes;

	public Camion(double cargaMaxima, String matricula, int numEjes) {
		super(cargaMaxima, matricula);
		this.numEjes  = numEjes;
	}
	
	@Override
	public double calcularFuel() throws VehiculoException{
		
		 if(numEjes < 2) throw new VehiculoException("No se puede calcular", 0);
		
		return  this.getCargaActual() * 30 + 2 * numEjes;
	}

}
