package casa;

import java.util.Scanner;

public class T6Arraymio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		System.out.print("");
		
		int [] array = new int [10] ;
		
		while (true) { System.out.println("a.Mostrar Valores") ; System.out.println("b.introducir valor") ; 
		
		System.out.println("c.Salir") ; char opcion = scan.next().toLowerCase().charAt(0) ; 
		
		switch(opcion)  {  
		
			case'a': for ( int i = 0; i<array.length ; i++  ) { System.out.print(array[i]) ;} break ;
		
			case'b': int valor = scan.nextInt(); int posicion = scan.nextInt() ;
			
			if (posicion>=0 && posicion<array.length) { array[posicion]=valor ;} break;
			
			case'c': return ;
			
			default:
				System.out.println("Opcion no valida") ;
			
			}
		
		
		} 
	}
}	