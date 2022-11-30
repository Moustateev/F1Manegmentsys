package dataProject;

public class teams {
	private static teamNode head = null;
	
public static void insertTeam(String name,  int carNumber, String racerName) { //function to insert teams
	teamNode NewNode = new teamNode();
	NewNode.name = name;
	NewNode.racerName = racerName;
	NewNode.carNumber = carNumber;

		if(head==null) {
			head=NewNode;
		}
		else {
			teamNode n = head;
				while(n.next!=null) {
					n=n.next;
				}
			n.next=NewNode;
		}
}

public int countNodes(){ // function to count the number of teams
    int count = 0;
    teamNode currentNode = head;
    while (currentNode != null) {
        count++;
        currentNode = currentNode.next;
    }
    return count;
}


public void displayLastTeam() { // to display the last team entered

	teamNode node = new teamNode();
		node = head;
	while(node.next!=null){
		node = node.next;
	}
		System.out.println("-------------TEAM--------------");
		System.out.println("Name: "+ node.name);
		System.out.println("-------------------------------");
			for(int i = 0; i < node.x; i++) {
				System.out.println(node.carNumber+" "+node.racerName+" ");
			}
		System.out.println("-------------------------------");
		System.out.println("Total Wins:"+node.totalWins);
		System.out.println();
		main.mainMenu();
}

public static void displayAllTeams() { // function to display all teams
	teamNode node = new teamNode();
		node=head;
			while(node!=null){
				System.out.println("-------------ALL TEAMS--------------");
				System.out.println("Name: "+ node.name);
				System.out.println("-------------------------------");
				for(int i = 0; i<node.x; i++) {
					System.out.println(node.carNumber+" "+node.racerName+" ");
				}
				System.out.println("-------------------------------");
				System.out.println("Total Teams: "+node.x);
				System.out.println();
				node=node.next;
				}
}

public static boolean checkTeam(String name) { // function to check if the team exists in the program
	teamNode node = new teamNode();
		node= head;
		while(node != null) {
			if(node.name.equals(name)) {
				return true;
}
			else {
				node = node.next;
				}
			}
		return false;
}

public static void deleteTeam(String name) {// function to delete teams
	int pos = 1;
	teamNode node = head;
	while(!node.name.equals(name)) {
		pos++;
		node = node.next;
}
	deleteAtpos(pos);
}

public static void deleteAtpos(int pos) { // function to delete teams at specific locations in case of cheating....
	if(pos==1) {
		head=head.next;
}
	else {
		teamNode n = head;
		for(int i=1;i<=pos-2;i++) {
			n=n.next;
}
		n.next=n.next.next;
		}
	}
}