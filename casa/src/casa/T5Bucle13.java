package casa;

import java.util.Scanner;

public class T5Bucle13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		int n = 0 ;

		int positivo = 0;
		
		for ( int i = 1 ; i<=10 ; i++ ) { int numero = scan.nextInt() ; if (numero<0) { n++ ; } else if (numero>0) { positivo++ ;} } ; 
		
		System.out.print(positivo + " " + n);
	}
	
}