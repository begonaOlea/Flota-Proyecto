package com.curso.varios;

public class EjemploArgVariables {
	
	
	public double media(int a, int b) {
		return (a+b)/2;
	}
	
	public static double media(int[] numeros) {
		double media = 0;
		for(int n: numeros) {
			media += n;
			
		}
		return media / numeros.length;
	}
	
	public static double media(double inicio, double... numeros) {
		double media = inicio;
		for(double n: numeros) {
			media += n;
			
		}
		return media / numeros.length;
	}
	

	public static double media(int inicio , double... numeros) {
		double media = 0;
		for(double n: numeros) {
			media += n;
			
		}
		return media / numeros.length;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] n = {3,34,8,66};
		media(n);
		
		media(3,5.5,8.9,88);
	
		
	}

}
