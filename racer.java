package dataProject;

public class racer {
	static racerNode head = null;
	
public void insertRacer(String name, int age, String team){
	racerNode NewNode = new racerNode();
	NewNode.racerName = name;
	NewNode.age = age;
	NewNode.team = team;
	NewNode.next=head;
	head=NewNode;
}

public int countNodes(){
    int count = 0;
    racerNode currentNode = head;
    while (currentNode != null) {
        count++;
        currentNode = currentNode.next;
    }
    return count;
}


public racerNode deleteRacer() {
	racerNode temp = head;
	head = head.next;
	return temp;
}

public static racerNode findByNumber(int id) {
	racerNode node = new racerNode();
	node= head;
	while(node.number != id) {
		node = node.next;
	}
	return node;
}

public boolean findRacer(int id) {
	racerNode node = new racerNode();
	node= head;
	while(node != null) {
		if(node.number == id) {
			return true;
		} 
		else {
			node = node.next;
		}
	}
			return false;
}

public void display() {
	System.out.println("Racer's name");
	racerNode node = new racerNode();
	node=head;
	while(node!=null){
		System.out.print(" "+ node.number+" "+node.racerName);
		int spaces = 12- node.racerName.length();
		for(int i = 0; i<spaces; i++ ) {
			System.out.print(" ");
		}
		node = node.next;
		System.out.println();
		}
	}

public static void insertRacer(String name, int age, int number, String team) {
	// TODO Auto-generated method stub
	
	}
}