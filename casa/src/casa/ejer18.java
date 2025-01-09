package casa;

import java.util.Scanner;

public class ejer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int hora = scan.nextInt();

		int minuto = scan.nextInt();

		int segundo = scan.nextInt();

		if (segundo == 60) {
			minuto++; 
			segundo = 0;
		} ;
		if (minuto == 60) {
			hora++;
			minuto = minuto - 60;
		} ;
		System.out.println(hora) ;
		System.out.println(minuto) ;
		System.out.println(segundo) ;
	};
}
