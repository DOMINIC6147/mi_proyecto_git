package casa;

import java.util.Scanner;

public class T5Bucle7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		int combinacion = 1234 ;
		
		int contador = 0 ;
		
		boolean abierta = false ;
		
		while (contador <4 && !abierta) { System.out.print("Dime la combinacion"); int intento = scan.nextInt() ; if (intento == combinacion) 
		{ System.out.print("La caja esta abierta") ; abierta = true ; } else  { contador++ ;  } 

	}
	}
}