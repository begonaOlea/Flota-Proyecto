package temporal;

import java.util.Date;

public class Pruebas {
	
	 public static void main(String[] args) {
	    	Empleado e = new Empleado();
			e.nombre = "luis";
			e.fechaNac = new Date();
			System.out.println(e.getDetalles());
			
			Gerente g = new Gerente();
			g.nombre ="Carlos";
			g.departamento = "Inf";
			System.out.println(g.getDetalles());
			g.calcularSalario();
			
			g.activo = true;
			
			
	    	
		}

}
