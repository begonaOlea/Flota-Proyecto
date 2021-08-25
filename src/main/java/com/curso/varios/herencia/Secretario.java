package com.curso.varios.herencia;

public class Secretario extends Empleado{

    private String[] idiomas;

    @Override
    public String getDetalles() {
        return super.getDetalles(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String[] getIdiomas() {
		return idiomas;
	}
}
