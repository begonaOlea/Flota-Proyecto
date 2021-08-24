package com.curso.flota.dominio;

import java.io.Serializable;

public class Caja implements Serializable{

	private double peso;
	
	
	public Caja() {
		//super();
		this.peso = 10;
	}
	
	public Caja(double peso) {
		super();
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		//validar
		if (peso > 0 )
			this.peso = peso;
	}

	@Override
	public String toString() {
		return "Caja [peso=" + peso + "]";
	}
	
	
	
}
