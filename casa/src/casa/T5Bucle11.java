package casa;

import java.util.Scanner;

public class T5Bucle11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		int n = scan.nextInt() ;

			
		System.out.println("numero\tCuadrado\tCubo" );
		
		System.out.println("-----------------------------");
			
		for ( int i = n ; i<n+5 ; i++ ) { int cuadrado = i*i ; int cubo = i*i*i  ; System.out.println(i+"\t"+cuadrado+"\t\t"+cubo); } ; 
	}
	
}