package dataProject;
import java.util.Scanner;

public class Admin {
	
	
	public int wins = 0;
	public int numberTeams = 0;
	Scanner scan = new Scanner(System.in);
	private String admin = "FIA";
	private String password = "0000";
	
public static void admin() {
	System.out.print("Please enter your User Name: ");
	String name = scan.next();
	if(name.equals(admin)) {
		System.out.print("Please enter your password: ");
		String password1 = scan.next();
	if(password1.equals(password)) {
		System.out.println("Welcome manager " +admin);
			loggedIn();
		}
	else {
		System.out.println();
		System.out.println("Wrong password\nPlease try again");
		System.out.println();
		main.mainMenu(); }
	}
	else {
		System.out.println("Wrong username\n Please try again");
		main.mainMenu();
	}
}

private static void loggedIn() {
	int n;
	System.out.print("\n1. Add new Team\n2. Add new Driver\n3. Today total Drivers\n4. Today total Teams\n5. List of Teams\n6. Show All Drivers\n7. Cancel Driver\n8.Back to main menu");
	System.out.println();
	System.out.print("Please choose: ");
	n = scan.nextInt();
	System.out.println();
	if(n==1) {
		addNewItem();
	}
	else if (n==2) {
		System.out.println("Today total Drivers driver");
		countNodes();
		System.out.println();
		System.out.print("1. Admin Panel\n2. Main Menu\nPlease choose:");
		int y = scan.nextInt();
	if(y == 1) {
			loggedIn();
	}
	else if(y == 2) {
		System.out.println();
		main.mainMenu();
		}
	} 
	else if(n==3) {
		System.out.println("total number of drivers is"+admin);
		System.out.println();
		System.out.print("1. Admin Panel\n2. Main Menu\nPlease choose:");
	int x = scan.nextInt();
	if(x == 1) {
		loggedIn();
	}
	else if(x == 2) {
		System.out.println();
		main.mainMenu();
		}
	}
	else if (n==4) {
		stackRacer stackRacer = new stackRacer();
		stackRacer.display();
		System.out.println();
		System.out.print("1. FIA Menu\n2. Admin panel\nPlease choose:");
		int x = scan.nextInt();
	if(x==1) {
		System.out.println();
		main.mainMenu();
	}
	else {
		loggedIn();
		}
	}
	else if (n==5) {
		teamHist.displayAllTeams();
		System.out.print("1. Main Menu\n2. Admin panel\nPlease choose:");
		int x = scan.nextInt();
	if(x==1) {
			System.out.println();
			main.mainMenu();
		}
	else {
		loggedIn();
		}
	}
	else if (n==6) {
		System.out.print("choose the name of the order you want to cancel: ");
		System.out.println();
		String name = scan.next();
		if(teamHist.checkTeam(name)==false) {
			System.out.println("an order in this name was not found");
			System.out.println();
		} 
		else{
			teamHist.deleteTeam(name);
			System.out.println("------ORDER CANCELED SUCCESSFULLY------");
		}
		System.out.println();
		System.out.print("1. Main Menu\n2. Admin panel\nPlease choose:");
		int x = scan.nextInt();
		if(x==1){
			System.out.println();
			main.mainMenu();
		}
		else {
			loggedIn();
		}
	}
	else if(n==7) {
		main.mainMenu();
	}
	else {	
		System.out.println("You chose an invalid number");
		System.out.println("please choose again:");
		System.out.println();
		loggedIn();
	}
}
private static void countNodes() {
	// TODO Auto-generated method stub
	
}

private static void addNewItem() {
	System.out.print("Enter name of item: ");
	String name = scan.next();
	System.out.print("Enter the price: ");
	double price = scan.nextDouble();
	System.out.print("Enter the number ID of the item: ");
	int id = scan.nextInt();
		while(number_customers <= 20){
			System.out.print("The entered number ID is already used please enter another");
			id = scan.nextInt();
		}
		stackRacer.push(name, price, id);
		System.out.println("----ITEM ADDED SUCCESSFULLY----");
		System.out.println();
		System.out.print("1. Admin Panel\n2. Main Menu\nPlease choose: ");
		int n = scan.nextInt();
		if(n == 1) {
			loggedIn();
		}
		else if(n == 2) {
			System.out.println();
			main.mainMenu();
		}
}

public static int teams() {
	return teams;
}

public static int numberOfRacer() {
	return number_customers;
	}
}