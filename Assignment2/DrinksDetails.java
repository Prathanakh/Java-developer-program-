package Menu;

import java.util.Scanner;

public class DrinksDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		//static int Drinks_total_bill = HotDetails.hot_total_bill+SoftDetails.soft_total_bill;
			System.out.println("1) HotDrinks");
			System.out.println("2)SofttDrinks");
			System.out.println("3)Back");
			System.out.println("Enter The choice");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				HotDetails details = new HotDetails();
				details.HotDrinksMenu();
			break;
			case 2:
				SoftDetails detail = new SoftDetails();
				detail.softDrinksMenu();
			break;
			case 3:
			RestaurantClient.main(null);
			break;
			default:
			System.out.println("Choose 1 to 3 between");
			}

			}// end of biryaniMenu
	}}
