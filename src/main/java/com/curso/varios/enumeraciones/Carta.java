package com.curso.varios.enumeraciones;

import java.util.Random;

public class Carta {
	
	private int numero;
	private Palos palo;
	
	
	public Carta(int numero, Palos palo) {
		super();
		// validar que el numeor va del 1 al 12
		// ya no hay que validar que palo es "CORAZONES", "PICAS", "TREVOL", "DIAMANTES"
		this.numero = numero;
		this.palo = palo;
	}
	
	
	public Carta() {
		Random rd = new Random();
		this.numero = rd.nextInt(12);
		this.palo = Palos.values()[rd.nextInt(3)];
		
	}
	
	public int jugar(Carta c2) {
		
		if(this.palo == c2.palo && this.numero == c2.numero) return 0;
		
	
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		
		Carta c = new Carta(1, Palos.CORAZONES);
		
		Palos  p1 =  Palos.CORAZONES;
		Palos  p2 =  Palos.CORAZONES;
		
		if (p1 == p2 )  System.out.println("iguales");
		
		System.out.println(p1.ordinal());
		System.out.println(Palos.PICAS.ordinal());
		
		Palos[]  palos = Palos.values();
		
		System.out.println(Palos.CORAZONES);
		
		
		
		System.out.println("Valor de CORAZONES ES " +  p1.getValor());
		
		System.out.println("Valor de CORAZONES ES " +  p2.getValor());
		
		System.out.println("Valor de CORAZONES ES " +  Palos.CORAZONES.getValor());
		
		System.out.println("cambio.......");
		
		p1.setValor(233);
		
		

		System.out.println("Valor de CORAZONES ES " +  p1.getValor());
		
		System.out.println("Valor de CORAZONES ES " +  p2.getValor());
		
		System.out.println("Valor de CORAZONES ES " +  Palos.CORAZONES.getValor());
		
		
	}

}
