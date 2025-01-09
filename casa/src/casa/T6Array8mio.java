package casa;

import java.util.Scanner;

public class T6Array8mio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		double [] n = new double [100] ;

		for ( int i=0; i<n.length; i++) { n[i]=Math.random() ; }
		
		double r = scan.nextDouble() ;
		
		int con = 0; 
		
		for ( int i=0;i<n.length; i++ ) {  if (n[i]>=r) { con++ ; } ;} ;
		
		System.out.print(con);
	}
}	