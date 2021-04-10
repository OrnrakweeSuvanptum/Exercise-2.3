public class Main {
	public static void main(String[]args) {
	
		Motorcycle Brand1 = new Motorcycle(); //create first new object Motorcycle 
		Brand1.printMotorcycleScanner();
		Brand1.calcPriceScanner();
		Brand1.calcMonthlyPaymentScanner();
		Brand1.calMotorcycleServicesScanner();
		
		System.out.println();
		
		Motorcycle Brand2 = new Motorcycle(); //create second new object Motorcycle
		Brand2.printMotorcycleScanner();
		Brand2.calcPriceScanner();
		Brand2.calcMonthlyPaymentScanner();
		Brand2.calMotorcycleServicesScanner();
	}

}