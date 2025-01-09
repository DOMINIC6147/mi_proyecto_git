package casa;
import java.util.Scanner ;
public class index6 {

	public static void main(String[]args ) 
	{
		Scanner scan = new Scanner(System.in) ;
		
		int n1 = scan.nextInt() ;
		
		int n2 = scan.nextInt() ;
		

			if (n1 > n2) { 
				System.out.print(n1) ; 
				} else if (n1<n2) { System.out.print(n2); } 
				
				else {System.out.print("es igual") ;};
		} ;
	}

