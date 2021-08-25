package com.curso.varios.herencia;

public class PruebaPolimorfismo {
	
	
	public static void main(String[] args) {
		
		
		
		
		// UNA VAR DE REF puede apuntar a objetos de su tipo o hijos
		
		Gerente gerente = new Gerente("Laura",8, "Informatica");
	    Object o = gerente;
	    Empleado emp = gerente;
	    
	    o.toString();
	    //o.getDetalles();
	    System.out.println(emp.getDetalles() ); //Empleado, Ge, sec , ce, hijos de Empleado
	    
	   // emp.mandar(); 
	    System.out.println(gerente.getDetalles());
	   gerente.mandar();
	   
	   
	    // 
	    Empleado e = new Empleado("Luis",5);
		
		Empleado g  = new Gerente("Laura",8, "Informatica");
	        
		System.out.println(e.getDetalles());
		System.out.println(g.getDetalles());
	  // g.mandar();
		
		System.out.println(".............");
		Empleado[] lista =  {
				new Gerente("Laura Roca",5555,"Inf"),
				new Empleado("Carlos",5544455),
				new Jefe(),
				new Empleado("Rosa",44444),
		}   ;// bd.getEmpleados();
		
		for(Empleado em : lista) {
			System.out.println(em.getDetalles());
			
		}
	   
		generarNomina(g);
		generarNomina(new JefeProyecto());
		
		
	}
	



	public static void generarNomina(Empleado e) {
		System.out.println("Nomina es " + e.calcularSalario());
	}
	
	

}
