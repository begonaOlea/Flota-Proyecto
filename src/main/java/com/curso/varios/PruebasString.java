package com.curso.varios;

import java.util.Objects;

public class PruebasString {
	
	static Punto p55;

	public static void main(String[] args) {
	
		
		//String  PoolString  ==  equals
		
		String s1 = "hola";
		String s2 = new String("hola");
		String s3 = "hola";
		
		//  == compara el contenido de la variable, es decir, la direc de memoria
		
		System.out.println(" s1 == s2 ? " + (s1 == s2));
		System.out.println(" s1 == s3 ? " + (s1 == s3));
		
		// equals() se emplea para comparar objetos no sus direcciones
		
		System.out.println(" s1 equals s2 ? " + (s1.equals(s2)));
		System.out.println(" s1 equals s3 ? " + (s1.equals(s3)));
		
		
		//Punto (x,y)  == equals
		/*
		 *    atributos x, y de tipo int
		 *    toString
		 *    Constructor x , y
		 *    getter
		 *    
		 */
		
		 Punto p1= new Punto(2,3);

		 Punto p2= new Punto(2,3);

		 Punto p3=  p1;
		 
		 // comparar == y con equals	
		 
		 System.out.println(" p1 == p2 ? " + (p1 == p2));
	     System.out.println(" p1 == p3 ? " + (p1 == p3));
		 
	     // como no hemos sobreescrito equals usa == 
		 System.out.println(" p1 equals p2 ? " + (p1.equals(p2)));
		 System.out.println(" p1 equals p3 ? " + (p1.equals(p3)));

		 //String es inmutable
		 String nombre  = "Luis Ramos";  // Luis Ramos
		 String ap = new String ("otro");
		 nombre = nombre.concat("De la Varga"); // Luis RAmos de la Varga  
		 nombre = nombre + " ....";                                    //De la vadrga
		 System.out.println("nombre es " + nombre);
		 
		 StringBuilder nombre2 = new StringBuilder("Begoña");
		 nombre2.append("Olea");
		 
		 System.out.println("nombre es " + nombre2);
		 
		 Punto p4 = new Punto(3,3);
		 System.out.println(p4);
		 
		 Punto p44 = null;
		 p44.getColor();
		 
		 p55.getColor();
	}

}

class Punto{
	
	private int x;
	private int y;
	private  String color;
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.color = "black";
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punto [" + x + ", " + y + "] - color: " + this.color ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return x == other.x && y == other.y;
	}
	
	
	public String getColor() {
		return color;
	}
	
}

