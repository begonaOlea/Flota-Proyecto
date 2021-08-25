package com.curso.flota.informes;

import com.curso.flota.dominio.Caja;
import com.curso.flota.dominio.Vehiculo;
//import com.curso.flota.dominio.*;


public class InformeFlota {

	public void generar() {
		
		//com.curso.flota.dominio.Vehiculo v = new com.curso.flota.dominio.Vehiculo (0, "T9999");
		
		Vehiculo v;
		Caja c;
		
	}
	
	
	public void  informeConsumo(Vehiculo[] flota) {
		
		System.out.println("... Informe consumos flota ...");
		System.out.println(" Consumos por vehiculo ");
		double total = 0;
		for (Vehiculo f: flota){
			double consumo =  f.calcularFuel() ;
			total += consumo;
			System.out.println(f.getMatricula() + ": " + consumo );
			
		}
		System.out.println(" ....................... ");
		System.out.println(" TOTAL CONSUMO " + total);
		System.out.println(" ....................... ");
		
	}
	

}

class AsistenteInforme{
	
}
