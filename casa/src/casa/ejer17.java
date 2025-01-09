package casa;



public class ejer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nombre = scan.nextLine();

		double htrab = scan.nextDouble();

		double tarifa = scan.nextDouble();

		double sbruto = 0.0 ;
				
		double tasa = 0.0 ;
		
		if (htrab <= 35) { sbruto = htrab * tarifa ; } 
		else {sbruto = (35 * tarifa ) + ( htrab - 35 ) * tarifa * 1.5 ; } 
			;
		if (sbruto > 900 ) { tasa += (sbruto - 900) * 0.45 ;
			 tasa += 400 * 0.25 ;} 
		else if (sbruto > 500 ) { tasa += (500 - sbruto) * 0.25 ;}
		
		double sneto = sbruto - tasa ;
		
		System.out.println(sbruto);
		System.out.println(sneto);
		System.out.println(tasa);
		System.out.println(nombre);
	}
}
