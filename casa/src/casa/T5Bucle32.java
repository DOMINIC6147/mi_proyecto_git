package casa;

import java.util.Scanner;

public class T5Bucle32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		long n = scan.nextLong();
		
		long suma = 0;
		
		String digito = "";
		
		String n2 = String.valueOf(n);
		
		for ( int i=0; i<n2.length(); i++ ) { char dig = n2.charAt(i) ; int p = Character.getNumericValue(dig) ; 
		if ( p %2 == 0) { suma +=p; digito +=p+" " ;} ; } ; System.out.println(suma); System.out.print(digito.isEmpty()?"ninguno":digito); 
	}
}