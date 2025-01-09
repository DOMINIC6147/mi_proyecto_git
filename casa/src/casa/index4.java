package casa;
import java.util.Scanner ;
public class index4 {

	public static void main(String[]args ) 
	{
		Scanner scan = new Scanner(System.in) ;
		
		double poriginal = scan.nextDouble() ;
		
		double pventa = scan.nextDouble() ;
		
		if (pventa !=0) { System.out.println(poriginal / pventa) ;};
	}
}
