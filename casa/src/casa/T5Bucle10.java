package casa;

import java.util.Scanner;

public class T5Bucle10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

			int i = 0;
			
			double suma = 0;
			
		while (true) { int n = scan.nextInt() ; if ( n <0  ) { break; } suma += n ; i++ ;  }  ;
			
		System.out.print(suma/i);
	}
	
}