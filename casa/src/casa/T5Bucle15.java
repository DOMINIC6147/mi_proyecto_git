package casa;

import java.util.Scanner;

public class T5Bucle15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		double base = scan.nextDouble() ;

		int exponente = scan.nextInt() ;
		
		int resultado = 1;
		
		for (int j=1 ; j<=exponente ; j++) { for ( int i = 1; i<=j ; i++)  { resultado *= base ; }  ; System.out.println(resultado); } ;
	}
}