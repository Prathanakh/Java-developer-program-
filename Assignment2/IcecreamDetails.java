package Menu;

import java.util.Scanner;

public class IcecreamDetails {
	Scanner sc = new Scanner(System.in);
	int vanilla_price = 100;
	int strawberry_price = 120;
	int buttersc_price = 80;
	static int icecream_total_bill;
	int vanilla_bill;
	int strawberry_bill;
	int buttersc_bill;

	void chiken() {
	System.out.println("How many scoops Do You Want ?");
	int scoops = sc.nextInt();
	vanilla_bill = scoops * vanilla_price;
	System.out.println("vanilla Bill :" + vanilla_bill);
	icecream_total_bill = icecream_total_bill + vanilla_bill;

	}

	void strawberry() {
	System.out.println("How many scoops do you want?");
	int scoops = sc.nextInt();
	strawberry_bill = scoops * strawberry_price;
	System.out.println("strawberry Bill :" + strawberry_bill);
	icecream_total_bill = icecream_total_bill + strawberry_bill;
	}
	
	void buttersc() {
		System.out.println("How many scoops Do You Want ?");
		int scoops = sc.nextInt();
		buttersc_bill = scoops * buttersc_price;
		System.out.println("buttersc Bill :" + buttersc_bill);
		icecream_total_bill = icecream_total_bill + buttersc_bill;

		}

	public void IcecreamMenu() {
	System.out.println("1)vanilla ");
	System.out.println("2)strawberry ");
	System.out.println("3)Butterscotch ");
	System.out.println("4)Back");
	System.out.println("Enter The choice");
	int choice = sc.nextInt();
	switch (choice) {
	case 1:
	chiken();
	IcecreamMenu();
	break;
	case 2:
	strawberry();
	IcecreamMenu();
	break;
	case 3:
	buttersc();
	IcecreamMenu();
		
	case 4:
	RestaurantClient.main(null);
	break;
	default:
	System.out.println("Choose 1 to 4 between");
	}

	}// end of IcecreamMenu

}

