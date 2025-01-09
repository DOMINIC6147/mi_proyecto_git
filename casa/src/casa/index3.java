package casa;
import java.util.Scanner ;
public class index3 {

	public static void main(String[]args ) 
	{
		Scanner scan = new Scanner(System.in) ;
		
		double poriginal = scan.nextDouble() ;
		
		double pventa = scan.nextDouble() ;
		
		double descuento = ((poriginal - pventa ) / poriginal ) * 100;
		
		System.out.print(descuento) ;
	}
}
