package Menu;

import java.util.Scanner;

public class HotDetails {
	
	Scanner sc = new Scanner(System.in);
	int tea_price = 10;
	int coffee_price = 20;
	static int hot_total_bill;
	int tea_bill;
	int coffee_bill;
	
	
	void tea() {
		System.out.println("How many cups do You Want ?");
		int cups = sc.nextInt();
		tea_bill = cups * tea_price;
		System.out.println("Tea Bill :" + tea_bill);
		hot_total_bill = hot_total_bill + tea_bill;

		}
	void coffee() {
		System.out.println("How many cups do You Want ?");
		int cups = sc.nextInt();
		coffee_bill = cups * coffee_price;
		System.out.println("Coffee Bill :" + coffee_bill);
		hot_total_bill = hot_total_bill + coffee_bill;

		}
	
	public void HotDrinksMenu() {
		System.out.println("1)Tea");
		System.out.println("2)Coffee");
		System.out.println("3)Back");
		System.out.println("Enter The choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
		tea();
		HotDrinksMenu();
		break;
		case 2:
		coffee();
		HotDrinksMenu();
		break;
		case 4:
			DrinksDetails.main(null);
		break;
		default:
		System.out.println("Choose 1 to 3 between");
		}



		}// end of biryaniMenu
}
