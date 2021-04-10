import java.util.Scanner;

	public class Motorcycle {
		
		Scanner s = new Scanner(System.in);

		void printMotorcycleScanner() {
			
			System.out.println("Enter Brand, Colour, Engine, Type : ");
			String b = s.nextLine();
			String c =s.nextLine();
			String e = s.nextLine();
			String t = s.next();
			
			System.out.println("Brand : " + b);
			System.out.println("Colour : " + c);
			System.out.println("Engine : " + e);
			System.out.println("Type : " + t);
		}
		
		void calcPriceScanner(){
			
			System.out.println("Enter Price and Quantity: ");
			int p = s.nextInt(); 
			int q = s.nextInt();
			
			int T = p*q;
			System.out.println("Total Price = RM" + T);
		}
		
		void calcMonthlyPaymentScanner() {
			
			double i = 0.05; //interest rate
			double d = 0.15; //down payment
			double mP = 0;
			
			System.out.print("Enter Price: RM");
			int p = s.nextInt();
			System.out.println("Price: RM" + p);
			
			d = p*d; 
			System.out.println("Down Payment: RM" + d);
			
			mP = p-d;
			System.out.println("Monthly Payment: RM" + mP);
					
			double I = mP*i;
			System.out.println("Interest: RM" + I); 
			
			double t = (mP + I)/12; 
			System.out.printf("Total Monthly Payment: RM%.2f\n",t); 
			
		}
		
		void calMotorcycleServicesScanner(){
			
			double tax = 0.06;
			double totalServices = 0;
			
			System.out.print("Enter your services price: RM");
			int sP = s.nextInt();
			System.out.println("Services Price: RM" + sP);
			tax = sP*tax;
			System.out.printf("Tax: RM%.2f\n",tax);
			totalServices = sP+tax;
			System.out.println("Total Sevices Price: RM" + totalServices);
			
		}
		
	}
		

	


