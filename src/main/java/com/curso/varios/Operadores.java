package com.curso.varios;

public class Operadores {
	
	public static void main(String[] args) {
		
		// post/pre incremento/decremento
		
		int a = 8;
		a ++;  // 9
		
		int b =  a ++;  // b vale 9 y a vale 10
		                // primero asigna a en b y luego inc a
		int c = ++ a;  // c vale 10 y a vale 10
		               // primero incrementa a y luego lo asigna en c
		a = 5;
		if (a ++  ==  6 ) {
			System.out.println("entró");
		}else {
			System.out.println("no entró");
		}
		
		
		if (a == 6) {
			
		}
		a++;
		
		//and y or cortocircuitados
		
		// &  oparea bit a bit (numero) y &&   and cortocicuitado booleanos
		
		int z = 3 & a;
		
		z = 3;
		
		if( a > 9 && z <7) {  //  true  y true
			//si a >9 da fale ya no evalua el resto . Directamente false
			
		}
		
		
		
		// byte short int   long
		//  8     16   32   64 bits
		
		int grande = 1;  //   32 bit
		
		//if(grande < 128)
		byte peque = (byte) grande;   // -127 a 128    (8 bits)
		
		System.out.println(peque);
		
		long d = grande; //64 bit  //casting implicito
		
		
		
	
		
		
	}

}
