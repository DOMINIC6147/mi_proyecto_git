package casa;

import java.util.Scanner;

public class T6Arraymio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		
		int v = scan.nextInt();
		
		int incre = scan.nextInt();
		
		int longitud = scan.nextInt() ;
		
		int [] capacidad = new int [longitud] ;
		
		for ( int i=0 ; i<longitud ; i++) { capacidad[i]=v+(i*incre)  ;} ;
		
		for ( int i= 0; i<capacidad.length ; i++ ) { System.out.println(capacidad[i]);} ;
	}
}	