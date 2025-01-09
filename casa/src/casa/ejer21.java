package casa;

import java.util.Scanner;

public class ejer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int n2 = scan.nextInt();
		
		int media = (n + n2) / 2 ;
		
		if (media >= 5 ) { System.out.print(media) ;} 
		
		else  { scan.nextLine(); System.out.print("Recuperacion: ") ; String recuperacion = scan.nextLine(); 
		
		if (recuperacion.equalsIgnoreCase("Apto")) { System.out.println("La nota es un 5"); } else { System.out.print(media);  }	}
		
	}
	
}