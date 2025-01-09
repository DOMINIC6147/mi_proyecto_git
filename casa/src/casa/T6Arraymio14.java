package casa;

import java.util.Scanner;

public class T6Arraymio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;

		
		int tamaño = 0;
		
		for (int i=1; i<=10; i++) { tamaño+=i  ;};
	
		int [] array = new int [tamaño] ;
		
		int i=0;
		
		for (int numero =1; numero<=10; numero++) {for (int repe = 1; repe<=numero ; repe++) { array[i]=numero; i++   ;}   ;};
		
		for ( int j= 0; j<array.length ; j++) { System.out.println(array[j]) ;};
		
		
	}
}	