package Assignment;
import java.util.Scanner;
public class FirstClass {
	
	public static void main (String[] args) {
		FirstClass exp = new FirstClass();
		System.out.println("Question no 1");
		exp.hashdisplay();
		System.out.println("Question no 2");
		exp.atdisplay();
		System.out.println("Question no 3");
		exp.numdisplay();
		System.out.println("Question no 4");
		exp.evendisplay();
		System.out.println("Question no 5");
		exp.odddisplay();
		System.out.println("Question no 6");
		exp.Adisplay();
		System.out.println("Question no 7");
		exp.ABCDEFdisplay();
		System.out.println("Question no 8");
		exp.Star1display();
		System.out.println("Question no 9");
		exp.Star2display();
		System.out.println("Question no 10");
		exp.Primedisplay();
		System.out.println("Question no 11");
		exp.evencheckdisplay();
		System.out.println("Question no 12");
		exp.factorialdisplay();
		System.out.println("Question no 13");
		exp.fibodisplay();
	}
	
	void hashdisplay() {
		for (int i=1; i<=6; i++){
			for(int j=1; j<=6; j++){
				System.out.print('#');}
			System.out.println();}
	}
	
	void atdisplay() {
		for (int i=1; i<=6; i++){
			if (i==1 || i==6) {
			for(int j=1; j<=5; j++){
				System.out.print('@');}}
			else {
				for(int j=1; j<=5; j++){
					if(j==1 || j==5) {
					System.out.print('@');}
				else {
					System.out.print(' ');}}}
					System.out.println();}
	}

	void numdisplay() {
		for (int i=1; i<=50; i++){
				System.out.print(" " +i);
		if (i % 5 == 0)
			System.out.println();}
		
	}
	
	void evendisplay() {
		for (int i=1; i<=100; i++){
			if(i %2 ==0)
				System.out.print(" " +i);
		if (i % 10 == 0)
			System.out.println();}
		
	}
	void odddisplay() {
		for (int i=1; i<=50; i++){
			if(i %2 !=0)
				System.out.print(" " +i);
		if (i % 10 == 0)
			System.out.println();}
		
	}
	void Adisplay() {
		for (int i=1; i<=5; i++){
			for(int j=1; j<=6; j++){
				System.out.print('A');}
			System.out.println();}
	}
	void ABCDEFdisplay() {
		for (int i=1; i<=5; i++){
				System.out.print("ABCDEF");
			System.out.println();}
	}
	void Star1display() {
		for (int i=1; i<=5; i++){
			for(int j=i; j<=5; j++) {
				System.out.print('*');}
			System.out.println();}
	}

	void Star2display() {
		for (int i=1; i<=5; i++){
			for(int j=1; j<=i; j++) {
				System.out.print('*');}
			System.out.println();}
	}
	void Primedisplay()
	{
		System.out.println("Enter a number to check if it is a prime number or not");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 0;
		for(int i=2; i<num/2; i++) {
		if(num%i==0) {
			System.out.println("it is not a prime number");
			flag=1;
			break;}}
		if(flag==0)
			System.out.println("it is a prime number");
	}
	void evencheckdisplay()
	{
		System.out.println("Enter a number to check if it is a even number or not");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("it is an even number");
			}
		else {
			System.out.println("it is not an even number");}
	}
			void factorialdisplay() {
		     int fact=1;
		
			System.out.println("Enter a number to find a factorial");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			for(int i=1; i<=num;i++)
			{
				fact = fact*i;
			}
				System.out.println("factorial :"+fact);
		}
			void fibodisplay()
			{
				System.out.println("Enter a number to display fibonaccii series");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				int a=1;
				int b=1;
				System.out.print("Output:"+a +b);
				for (int i=1; i<=num-2; i++)
				{
					int c= a+b;
					System.out.print(c);
					a=b;
					b=c;
					
				}
				
			}
}
