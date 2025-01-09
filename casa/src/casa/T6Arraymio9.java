package casa;

import java.util.Scanner;

public class T6Arraymio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		int [] n = new int [100] ;

		for ( int i=0; i<n.length; i++) { n[i]= 1+ (int)(Math.random() *10); }
		
		int r = scan.nextInt() ;
		
		for ( int i=0;i<n.length; i++ ) {  if (n[i]==r) { System.out.println(i); } ;} ;
		
	}
}	