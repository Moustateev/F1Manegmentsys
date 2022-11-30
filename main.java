package dataProject;
import java.util.*;

public class main {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		stackRacer.push("pizza", 15, 1);
		stackRacer.push("burger", 10, 2);
		stackRacer.push("pasta", 12, 3);
		stackRacer.push("hotdog", 7, 4);
		mainMenu();
	}
	public static void mainMenu() {
		System.out.print("1...Food part \r\n2...Admin\n3..Exit\nPlease choose: ");
		int choice = scan.nextInt();
		System.out.println();
		if(choice == 1) {
			FIA.racerList();
	}
	else if(choice == 2){
		Admin.admin();
	}
	else if(choice == 3) {
		System.out.println("All orders: ");
		teams.displayAllTeams();
	}
	else {
		System.out.println("You chose an invalid number");
		mainMenu();
		}
	}
}
