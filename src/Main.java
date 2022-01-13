import java.util.Scanner;
import java.lang.Math;
	public class Main {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Select 1 if you would like to solve for the hypotenuse \nSelect 2 if you want to solve for a missing side \nSelect 0 if you want to quit");
			int option = scan.nextInt();
			if(option==1) {
				System.out.println("What are the sides");
				double side1 = scan.nextDouble();
				double side2 = scan.nextDouble();
				double hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
				System.out.println(hypot); 
			}
			else if(option==2) {
				System.out.println("What is the side \nWhat is the hypotenuse");
				double side = scan.nextDouble();
				double hypot = scan.nextDouble();
				double missing_side = Math.sqrt(Math.pow(hypot, 2) - Math.pow(side, 2));
				System.out.println(missing_side);
				
			}
			else if(option==0) {
				System.exit(option);
			}
			else {
				System.out.println("Chose valid option");
			}
			scan.close();
		}
	
	}