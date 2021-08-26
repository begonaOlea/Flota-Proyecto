package com.curso.varios.interfaces;

import java.awt.Color;
import java.util.Hashtable;

public class PruebaInfertacesStatic {

	public static void main(String[] args) {
		
		Avion.saluda();
		
		Avion v = new Avion();
		v.saluda();
		
		
		Volable.convertirMetrosEnPies(2);
	//	v.convertirMetrosEnPies(2);
		
		Color c = Color.black;
		Color c2 = Color.BLACK;

		
		
	}

}
