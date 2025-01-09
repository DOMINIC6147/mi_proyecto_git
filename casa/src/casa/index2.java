package casa;
import java.util.Scanner ;
public class index2 {

	public static void main(String[]args ) 
	{
		Scanner scan = new Scanner(System.in) ;
		
		int edad = scan.nextInt() ;
		
		if ( edad >= 18 ) {
			System.out.print("es mayor de edad") ;
		} else {
			System.out.print("es menor de edad") ;
		};
	}
}
