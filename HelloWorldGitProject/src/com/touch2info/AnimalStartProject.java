package com.touch2info;

public class AnimalStartProject {

	
	//IMP: Can't write Sys out directly in class. It has to go in method. 
	//System.out.println("test before main"); 
	
	private int i;
	private String firstName = "defaultValue to first name variable";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********** Start of the application ******");
		
		AnimalStartProject animalStartProject = new AnimalStartProject();
		System.out.println("firstName BEFORE calling set method:"+animalStartProject.getFirstName());
		animalStartProject.setFirstName("New first name");
		System.out.println("firstName AFTER calling set method:"+animalStartProject.getFirstName());
		System.out.println("Now checking in ashish branch...");
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

	
}
