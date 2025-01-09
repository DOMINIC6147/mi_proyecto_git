package casa;

import java.util.Scanner;

public class T5Bucle19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		int altura = scan.nextInt();
		
		char caracter = scan.next().charAt(0) ;
		
		for ( int i= 1; i<=altura ; i++) { for ( int j=1 ; j<=(altura-i); j++ ) { System.out.print(" ") ;  } ; 
		for ( int j=1 ; j<=(2*i-1); j++ ) { System.out.print(caracter) ; } System.out.println(); } ;
	}
}