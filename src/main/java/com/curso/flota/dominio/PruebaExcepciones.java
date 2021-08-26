package com.curso.flota.dominio;

public class PruebaExcepciones {
	
	
	
	public static void main(String[] args)  {
		
		
		try {
			
			cargarCamion(new Caja(90), new Caja(90));
			
		} catch (VehiculoException e) {
			
			System.out.println(e.getMessage() );
			System.out.println("Hay un excedente de " + e.getExcedente() );
			
			e.printStackTrace();
		}
		
		
	}
	
	public static void cargarCamion(Caja c1, Caja c2) throws VehiculoException {
		
		Camion c = new Camion(100, "SsS", 2);
		
		c.cargar(c1);
		c.cargar(c2);
	}

}
