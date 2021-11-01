package Menu;

import java.util.Scanner;

public class SoftDetails {
	Scanner sc = new Scanner(System.in);
	int sprite_price = 30;
	int coke_price = 40;
	static int soft_total_bill;
	int sprite_bill;
	int coke_bill;
	
	void sprite() {
		System.out.println("How many cups do You Want ?");
		int cups = sc.nextInt();
		sprite_bill = cups * sprite_price;
		System.out.println("sprite Bill :" + sprite_bill);
		soft_total_bill = soft_total_bill + sprite_bill;

		}
	void coke() {
		System.out.println("How many cups do You Want ?");
		int cups = sc.nextInt();
		coke_bill = cups * coke_price;
		System.out.println("coke Bill :" + coke_bill);
		soft_total_bill = soft_total_bill + coke_bill;

		}
	public void softDrinksMenu() {
		System.out.println("1)sprite");
		System.out.println("2)coke");
		System.out.println("3)Back");
		System.out.println("Enter The choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
		sprite();
		softDrinksMenu();
		break;
		case 2:
		coke();
		softDrinksMenu();
		break;
		case 4:
			DrinksDetails.main(null);
		break;
		default:
		System.out.println("Choose 1 to 3 between");
		}



		}// end of biryaniMenu

}
