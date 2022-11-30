package dataProject;

public class stackRacer extends racer {
public stackRacer() {
	super();
}

public void push(String name, int age, int number, String team) {
	racer.insertRacer(name, age, number, team);
}

public racerNode pop() {
	return deleteRacer();
}

public void display() {
	racerNode boo;
	while(head != null) {
		boo = pop();
		stackRacerTemp.push(boo.racerName, boo.number, boo.age, boo.team);
		System.out.print(" "+ boo.number+" "+boo.racerName);
			int spaces = 12 - boo.racerName.length();
			for(int i = 0; i<spaces; i++ ) {
				System.out.print(" ");
			}
			System.out.println();
	}
		while(stackRacerTemp.head != null) {
			boo = stackRacerTemp.pop();
			push(boo.racerName ,boo.number,boo.age, boo.team);
		}
	}

public static void push(String name, double price, int id) {
	// TODO Auto-generated method stub
	
}
}