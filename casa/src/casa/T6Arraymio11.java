package casa;

import java.util.Scanner;

public class T6Arraymio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		int personas = scan.nextInt() ;
		
		double [] n = new double [personas] ;

		for ( int i=0; i<n.length; i++) { n[i]= scan.nextDouble() ; }
		
		double maxima = n[0] ;
		
		double minima = n[0] ;
		
		double suma = 0 ;
		
		double media = 0 ;
		
		for ( int i=0;i<n.length; i++ ) { suma +=n[i] ; if (n[i] > maxima ) { maxima =n[i] ; } if (n[i] < minima) { minima =n[i] ; } ; } ;
		
		media = suma/personas ;
		
		int encima = 0;
		
		int debajo = 0;
		
		for (int i=0; i<n.length ; i++) { if (n[i] > media ) { encima++ ; } if (n[i] < media) { debajo++ ; } ;} ;
		
		System.out.println(maxima + " " + minima + " " + media + " " + encima + " " + debajo);
	}
}	