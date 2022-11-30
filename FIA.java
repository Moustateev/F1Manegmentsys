package dataProject;
import java.util.Scanner;

public class FIA {
	static Scanner scan = new Scanner(System.in);
	public static void racersList() {
		System.out.print("1...Racers\r\n2...Teams \r\nPlease choose: ");
		int choice = scan.nextInt();
		System.out.println();
		if(choice == 1) {
			stackRacer stackRacer = new stackRacer();
			stackRacer.display();
			System.out.println();
			racersList();
		}
		else if(choice == 2){
			racer();
		}
}
public static void racer() {
	String [][] search = new String [20][10];
	int choice;
	int j = 0;
	int z = 0;
	double total=0;	
	do {
		z++;
		System.out.print("Please enter the racer's name and his team");
		search[j][0]= scan.nextLine();
		search[j][1]= scan.nextLine();
		System.out.println();
			while(Items.findIfAvailable(search[j][0])==false) {
				System.out.println("You entered a food id not available");
				System.out.print("Please enter the food id number and its quantity:" );
				items[j][0]= scan.nextLine();
				items[j][1]= scan.nextLine();
				System.out.println();
			}
			double x = items[j][1]*Items.findById(items[j][0]).price;
			total=total+x;
			j++;
			System.out.println("Do you want more item ?\n1..yes\n2..no");
			System.out.print("Please choose: ");
			choice = scan.nextInt();
		}
	while(choice == 1);
		String name;
		System.out.println();
		System.out.print("Please what is your name: ");
		name = scan.next();
		System.out.println();
		teams.insertTeam(name, items, total, z);
		Admin.total_income = Admin.total_income + total;
		Admin.number_customers = Admin.number_customers + 1;
		OrdersHistory.displayLastOrder();
}
public static void racerList() {
	System.out.print("1...Food part \r\n2...MainMenu \r\nEnter your choice:");
	int choice = scan.nextInt();
	System.out.println();
	if(choice == 1) {
		racerList();
	}
	
	else if(choice == 2){
		main.mainMenu();
		}
	}
}