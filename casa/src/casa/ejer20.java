package casa;

import java.util.Scanner;

public class ejer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int v = Math.abs(n%10) ;
		
		System.out.print(v);
	}
	
}