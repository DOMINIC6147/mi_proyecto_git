package casa;

import java.util.Scanner;

public class T6Array3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		int [ ] n = new int [10] ;

		for ( int i =0;i<n.length; i++) { n[i]=scan.nextInt() ; } ;

		for ( int i=n.length-1 ; i>=0; i--) { System.out.println(n[i]) ; } ;
	}
}	