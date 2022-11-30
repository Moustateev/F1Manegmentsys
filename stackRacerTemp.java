package dataProject;

public class stackRacerTemp extends racerTemp {
	
public stackRacerTemp() {
	super();
}

public static void push(String name, int age, int number, String team) {
	insertRacer(name, age, number,team);
}
public static racerNode pop() {
	return deleteRacer();
	}
}
