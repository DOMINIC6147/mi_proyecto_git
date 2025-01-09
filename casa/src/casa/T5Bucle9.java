package casa;

import java.util.Scanner;

public class T5Bucle9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		long n = scan.nextLong() ;

			int i = 0;
			
		do { i++; n/= 10 ; } while (n > 0) ; System.out.print(i) ;
	}
	
}