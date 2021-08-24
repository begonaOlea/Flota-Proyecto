package com.curso.flota.dominio;

import java.io.Serializable;

public class Caja implements Serializable{

	private double peso;
	
	public Caja() {
		peso = 0;
	}
	
	public Caja(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		//validar
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Caja [peso=" + peso + "]";
	}
	
	
	
}
