package com.curso.flota.dominio;

import java.io.Serializable;

/**
 * Clase que modela los datos de un vehiculo
 * La carga maxima permitida se asigna en kg
 * 
 * @author begonaolea
 * @version 1.0.0
 */
public abstract class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//variables  de clase - 1 para toda la aplicacion
	public static final double CARGA_MAXIMA_DEFECTO = 1000.0;
	
	// atributos - variables de instancia (objeto)
	private String matricula;
	private double cargaMaxima;
	private double cargaActual;
	private int numCajas;

	//constructores
	public Vehiculo(double cargaMaxima, String matricula) {
		super();
		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
		this.cargaActual = 0;
		this.numCajas = 0;
	}
	
	
	//métodos getters y setters
	

	public double getCargaMaxima() {
		return cargaMaxima;
	}
	

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getCargaActual() {
		return cargaActual;
	}


	public int getNumCajas() {
		return numCajas;
	}

	
	public void cargar(Caja caja) throws VehiculoException{
		
		if ( (caja.getPeso() + this.cargaActual ) > this.cargaMaxima ){
			throw new VehiculoException("No se puede cargar la caja . Excede del peso permitido",
					(this.cargaMaxima - ( this.cargaActual + caja.getPeso())));
			//System.out.println("No se pudo añadir caja. Exceso de carga");
		}	else {
			this.cargaActual += caja.getPeso();
			this.numCajas ++;
		}
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", cargaMaxima=" + cargaMaxima + ", cargaActual=" + cargaActual
				+ ", numCajas=" + numCajas + "]";
	}

	
	public abstract double calcularFuel()  throws VehiculoException;
	

	
}
