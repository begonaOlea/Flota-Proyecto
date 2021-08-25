package com.curso.flota.dominio;

import java.io.Serializable;

/**
 * Clase que modela los datos de un vehiculo
 * La carga maxima permitida se asigna en kg
 * 
 * @author begonaolea
 * @version 1.0.0
 */
public class Vehiculo implements Serializable {

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

	
	public void cargar(Caja caja) {
		int a = 9;
		if ( (caja.getPeso() + this.cargaActual ) > this.cargaMaxima ){
			//throw exception
			System.out.println("No se pudo añadir caja. Exceso de carga");
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

	
	public double calcularFuel() {
		return 0;
	}

	
	
	
}
