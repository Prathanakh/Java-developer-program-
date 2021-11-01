package Menu;
import java.util.Scanner;

public class RestaurantClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.println("************************************");
		System.out.println(" 1)Birayani ");
		System.out.println(" 2)Drinks ");
		System.out.println(" 3)IceCreams ");
		System.out.println(" 4)Bill ");
		System.out.println(" 5)Exit ");
		System.out.println("************************************");

		System.out.println("Enter The choice ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
		BiryaniDetails details = new BiryaniDetails();
		details.biryaniMenu();
		break;
		case 2:
		DrinksDetails.main(null);
		break;
		case 3:
		IcecreamDetails det = new IcecreamDetails();
		det.IcecreamMenu();
		break;
		case 4:
		int drinks_total=BiryaniDetails.biryani_total_bill + HotDetails.hot_total_bill+ SoftDetails.soft_total_bill+IcecreamDetails.icecream_total_bill;
		System.out.println("Total Bill : " + drinks_total);
		break;
		case 5:
		System.out.println("Thx for Using App!");
		System.exit(0);
		break;
		default:
		System.out.println("Choose 1 to 4 between");
		}
		} // end of while
		}
}
