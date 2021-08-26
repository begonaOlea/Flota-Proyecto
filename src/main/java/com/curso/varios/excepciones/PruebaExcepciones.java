package com.curso.varios.excepciones;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class PruebaExcepciones {
	
	
	public static void main(String[] args) {
		
		String a = null;
		if( a != null ) {
				a = a.toLowerCase();  // java.lang.NullPointerException 
							  // es una RuntimeException 
							  // No avisa de puede ocurrir  NO CHECKED
		
	    }
//		File fichero =null; new File("carta.txt");
//		
//		try {
//			fichero.createNewFile();   // puede lanzar  una IOException
//								    // CHECKED - que avisa y obliga a tratarlo
//		}catch(IOException e) {
//			System.out.println(" error el la creacion del fichero");
//		}catch(Exception e) {
//			System.out.println("Error desconocido consulte con su adm");
//		}
//		
		
		String num = "22";
		try {
				int n = Integer.parseInt(num);  //java.lang.NumberFormatException: For input string: "22a"
			
				
				int b = 7;
				b = b + n;
				System.out.println(" complete el try");
				throw new RuntimeException("adios");
		
		}catch(NumberFormatException e) {
			System.out.println("Debes poner un numero valido. " + e.getMessage());
			return;
		}catch(NullPointerException e) {
			System.out.println("... nulo");
		//}
		//catch(Exception e) {
		//	System.out.println("Error desconocico " + e.getMessage());
		}finally {
			// bloque que se ejecuta SIEMPRE SIEMPRE SIEMPRES
			// ocurra o no una excepcion
			// incluso retur o throw new exception
			System.out.println(" dentro de finally");
		}

		
		System.out.println("estoy despues catch");
		
		
//		//java 8  catching multiple
//		
//		try {
//			//...
//			//throw new SQLException();
//			Connection c =null;
//			c.close();
//			//c.commit();
//			
//		}catch(NumberFormatException | NullPointerException e) {
//			//mismo trtamineto
//		}catch(SQLException e2) {
//			//otro tra
//		}
//		
		
		
	}
	
	

}
