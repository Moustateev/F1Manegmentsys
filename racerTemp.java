package dataProject;

public class racerTemp {
	static racerNode head = null;
	
public static void insertRacer(String name,int age, int number, String team){
	racerNode NewNode = new racerNode();
	NewNode.racerName = name;
	NewNode.age = age;
	NewNode.number = number;
	NewNode.team = team;
	NewNode.next = head;
	head=NewNode;
}

public static racerNode deleteRacer() {
	racerNode temp = head;
	head = head.next;
		return temp;
	}
}
