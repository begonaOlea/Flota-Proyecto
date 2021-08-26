package com.curso.flota.dominio;

public class VehiculoException extends Exception {
	
	
	private double excedente; // peso superador 

	
	public VehiculoException(String mensajeError , double excedente) {
		super(mensajeError);
		this.excedente = excedente;
	}


	public double getExcedente() {
		return excedente;
	}
	

}
