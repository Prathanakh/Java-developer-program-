package Menu;
import java.util.Scanner;
public class BiryaniDetails {
	Scanner sc = new Scanner(System.in);
	int chicken_price = 100;
	int mutton_price = 120;
	int veg_price = 80;
	static int biryani_total_bill;
	int chicken_bill;
	int mutton_bill;
	int veg_bill;

	void chikenBiryani() {
	System.out.println("How many plates Do You Want ?");
	int plates = sc.nextInt();
	chicken_bill = plates * chicken_price;
	System.out.println("Chicken Bill :" + chicken_bill);
	biryani_total_bill = biryani_total_bill + chicken_bill;

	}

	void muttonBiryani() {
	System.out.println("How many plates do you want?");
	int plates = sc.nextInt();
	mutton_bill = plates * mutton_price;
	System.out.println("Mutton Bill :" + mutton_bill);
	biryani_total_bill = biryani_total_bill + mutton_bill;
	}
	
	void vegBiryani() {
		System.out.println("How many plates Do You Want ?");
		int plates = sc.nextInt();
		veg_bill = plates * veg_price;
		System.out.println("Veg Bill :" + veg_bill);
		biryani_total_bill = biryani_total_bill + veg_bill;

		}

	public void biryaniMenu() {
	System.out.println("1)Chicken Biryani");
	System.out.println("2)Mutton Biryani");
	System.out.println("3)Veg Biryani");
	System.out.println("4)Back");
	System.out.println("Enter The choice");
	int choice = sc.nextInt();
	switch (choice) {
	case 1:
	chikenBiryani();
	biryaniMenu();
	break;
	case 2:
	muttonBiryani();
	biryaniMenu();
	break;
	case 3:
		vegBiryani();
		biryaniMenu();
		
	case 4:
	RestaurantClient.main(null);
	break;
	default:
	System.out.println("Choose 1 to 4 between");
	}

	}// end of biryaniMenu

}
