package casa;

import java.util.Scanner;

public class T5Bucle14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		int n = scan.nextInt() ;

		int xp = scan.nextInt() ;
		
		long resultado = 1; 
		
		for ( int i = 0; i<xp ; i++)  { resultado *= n ; } ;
		
		System.out.println(resultado);
	}
	
}