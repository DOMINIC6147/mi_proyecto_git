package casa;
import java.util.Scanner ;
public class index {

	public static void main(String[]args ) 
	{
		Scanner scan = new Scanner(System.in) ;
		
		double n1 = scan.nextDouble();
		
		double circunferencia = Math.PI * n1 * 2 ;
		
		double tal = Math.PI * Math.pow(n1, 2) ;
		
		double volumen = (4/3 ) * Math.PI * Math.pow(n1, 3) ;
		
		System.out.println( circunferencia );
		System.out.println( tal );
		System.out.println( volumen );
	}
}
