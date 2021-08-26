package com.curso.varios.enumeraciones;

import java.awt.Color;

public enum Palos {
	//new Palos(10)
	PICAS(10,Color.BLACK), 
	CORAZONES(30,Color.RED), 
	TREBOLES(50,Color.BLACK), 
	DIAMANTES(100,Color.BLACK);
	
	//ATR
	
	private int valor;
	private Color color;
	
	//CONST
	private Palos(int valor, Color c) {
		this.valor = valor;
		this.color = c;
	}
	
	//METOD
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

}
