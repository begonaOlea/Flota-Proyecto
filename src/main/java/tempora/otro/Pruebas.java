package tempora.otro;

import java.util.Date;

import temporal.Empleado;


public class Pruebas {
	
	 public static void main(String[] args) {
	    	Empleado e = new Empleado();
			e.nombre = "luis";   //private
			e.fechaNac = new Date();  // package
			System.out.println(e.getDetalles());
			
	     	e.activo = true;
			
	    	
		}

}
