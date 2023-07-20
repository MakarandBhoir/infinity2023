package test;

public class Student {
	
	String firstName;
	String lastName;
	double score;
	
	// To display output
	public void display() {
		System.out.println("First Name = " + firstName);
		System.out.println("Last Name = "+lastName);
		System.out.println("Score = "+score);
		System.out.println("-------------------------------------");
	}
	
	// To get the input
	
	public static void main(String[] args) {
		// class_name obj = new class_name();
		Student janmesh = new Student();
		janmesh.firstName = "Janmesh";
		janmesh.lastName = "Mhatre";
		janmesh.score = 90;
		
		Student vinesh = new Student();
		vinesh.firstName = "Vinesh";
		vinesh.lastName = "Gharat";
		vinesh.score = 90; 
		
		janmesh.display();
		vinesh.display();
	}
}
