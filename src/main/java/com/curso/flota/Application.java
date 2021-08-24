package com.curso.flota;

import com.curso.flota.dominio.Vehiculo;

public class Application
{
	public static void main( String[] args )
	{
		
		//uso de una clase 
		//crear una instancia de la clase (objeto)
		
		Vehiculo v = new Vehiculo(200.0, "B7777");
		Vehiculo v2 = new Vehiculo(3000.0,"S8888");
		Vehiculo v3 = v;
		
		// v, v2, v3 son variables de referencia que apuntan a un objeto de 
		//           la clase Vehiculo
		
		
		int nota = 8;   //nota es una variable de tipos primitivo
		

		System.out.printf("Antes Carga maxima es %f, y nota %d ", v2.getCargaMaxima(), nota);
		
		generador(v2, nota);
		
		System.out.printf("Despues Carga maxima es %f, y nota %d %n", v2.getCargaMaxima(), nota);
		
		
		// mostrar los datos de un vehiculo
		
		
		System.out.printf("Matricula %s ,  cargaMax Permitida %f %n", 
				v2.getMatricula(),
				v2.getCargaMaxima());
		
		System.out.println(v2);
		
	}
	
	
	private static void generador(Vehiculo v, int nota) {
		
		 Vehiculo v4 = v;
		 nota = 9;
		 
		 v4.setCargaMaxima(555.0);
		 
		 Vehiculo v5 = new Vehiculo(4000, "U789");
		 
		
	}
	
}