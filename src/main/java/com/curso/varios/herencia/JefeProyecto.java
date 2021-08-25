package com.curso.varios.herencia;

public class JefeProyecto extends Empleado{
	
	private String proyecto;
	
	@Override
	public double calcularSalario() {
		return 200;
	}

}
