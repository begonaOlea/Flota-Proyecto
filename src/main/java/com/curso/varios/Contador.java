package com.curso.varios;

public class Contador {
	
	private final int VALOR_INICIA = 20;
	
	public static void main(String[] args) {
		Servidor s = new Servidor();
		Servidor s2 = new Servidor("ss");
	}

}

class Zapato{
	
	
	private final int TALLA;
	
	public Zapato(int talla) {
		this.TALLA = talla;
	}
}


class Servidor{
	
	private final int MAX_INTENTOS;
	
	{ //bloque init
		System.out.println("... bloque init");
		//int a = s.getMaxi();
		MAX_INTENTOS = 6; //
	}
	
	public Servidor() {
		super();
		System.out.println("... constructor");
	}
	
	public Servidor(String nombre) {
		super();
		System.out.println("... constructor nombre");
	}
	
	
	
}