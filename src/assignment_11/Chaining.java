package assignment_11;

public class Chaining {
	String name;
	
	Chaining(){
		this(" ");
		System.out.println("This is no-arg constructor of chaining class");
	}


	public Chaining(int i) {
		// TODO Auto-generated constructor stub
		this("java");
		System.out.println(i);
	}


	 Chaining(String name) {
		this.name=name;
		System.out.println("Calling parameterized constructor of chaining class...");
	}



}
