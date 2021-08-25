package com.curso.varios.herencia;

public class CEO extends Gerente {

	private double bonus;
	
	public CEO(String nombre, double salario, String departamento, double bonus) {
		super(nombre, salario, departamento);
	  this.bonus = bonus;
	}

 
}
