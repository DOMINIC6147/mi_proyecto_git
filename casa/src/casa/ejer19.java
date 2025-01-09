package casa;

import java.util.Scanner;

public class ejer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int anyo = scan.nextInt();

		if ((anyo % 4 == 0 && anyo % 100 !=0 ) || anyo % 400 == 0 ) { System.out.println(" Es bisiesto") ; }
		else { System.out.println(" No es bisiesto") ; } ;
	};
}
