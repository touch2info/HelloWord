package com.touch2info;

public class AnimalStartProject {

	
	//IMP: Can't write Sys out directly in class. It has to go in method. 
	//System.out.println("test before main"); 
	
	//instance variable (outside the method)
	private int i = 5;
	private String firstName = "defaultValue to first name variable";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********** Start of the application ******");
		
		//local variable 
		int i = 10;
		AnimalStartProject animalStartProject = new AnimalStartProject();
		System.out.println("firstName BEFORE calling set method:"+animalStartProject.getFirstName());
		animalStartProject.setFirstName("New first name");
		System.out.println("firstName AFTER calling set method:"+animalStartProject.getFirstName());
		System.out.println("Now checking in ashish branch...");
		System.out.println("Doing one more PR for ashish branch..");
		System.out.println("Checking from Anshul mac.. some other changes");
		System.out.println("New changes to add to git branch by anshul");
		System.out.println("i:"+ i);
		System.out.println("Set i value from set i method:" + animalStartProject.getI());
		
		//if else example
		
		int age = 11;
		
		if (age>12) {
			System.out.println("Anshul is older");
		} else {
			
			System.out.println("Anshul is younger");
		}
		System.out.println("\n\n");
		//Switch Example
		
		 int number=40;  
		    //switch expression with int value  
		    switch(number){  
		    //switch cases without break statements  
		    case 10: System.out.println("10");  
		    break;
		    case 20: System.out.println("20");  
		    break;
		    case 30: System.out.println("30");  
		    break;
		    default:System.out.println("Not in 10, 20 or 30"); 
		    }
		
		 System.out.println("\n\n");
		 
		 
		//Example that shows each 'if' statement refers to it's particular 'else' statement on same indent
		 int years=25;    
		    int weight=48;      
		    //applying condition on age and weight    
		    if(years>=18){      
		        if(weight>50){    
		            System.out.println("You are eligible to donate blood");    
		        } else{  
		            System.out.println("You are not eligible to donate blood");    
		        }  
		    } else{  
		      System.out.println("Age must be greater than 18");
		    }
		  System.out.println("\n\n");
		  
		//Code of Java for simple for loop 
		//The syntax is (initialization, condition, inc/decr)
		    for(int x=1;x<=5;x++){  
		        System.out.println(x);  
		    }
		      
		    System.out.println("\n\n");
		   
		//Declaring an array  
		    int arr[]={12,23,44,56,78};  
		//Printing array using for-each loop  
		    for(int y:arr){  
		        System.out.println(y);  
		    }
		    
		    System.out.println("\n\n");
		    
		 /*Confusing... So the first for loop executes with i1=1 and the second one with j=1
		  * It continues on to println (output is 1 1) because 'break aa' is only executed when i1 and j = 2
		  * What's key is that the first for loop executes as i1=1 but then the second loop keeps executing
		  * through its sequence as j=1, j=2, j=3 until it hits 4 and that's when the condition is false
		  * so it goes back to the first loop where i1=2 now and then j=1 and continues on the j=2
		  * BUT now i1 and j are both =2 which executes the break aa code and then stops the first loop 
		  * therefore stopping the second nest loop as well
		  * Question: Where exactly does the second loop go once the condition is false? - how does it know to go back to first loop
		  */
		    aa:  
		        for(int i1=1;i1<=3;i1++){  
		            bb:  
		                for(int j=1;j<=3;j++){  
		                    if(i1==2&&j==2){  
		                        break aa;  
		                    }  
		                    System.out.println(i1+" "+j);
		                }  
		        }  
		    
		    System.out.println("\n\n");
		    
		    /* This one different because line dd breaks instead of cc
		     * Breaks second loop when m and n = 2 then goes back to first loop where m=3 now
		     * Notice it goes from 2 1 to 3 1 and skips 2 3 even though 2 3 is not 2 2
		     *Qstn:What would be the code for "do nothing" instead of breaking the loop so that 2 3 still pops up?
		     *Ansr: continue;
		     */
		    cc:  
		        for(int m=1;m<=3;m++){  
		            dd:  
		                for(int n=1;n<=3;n++){  
		                    if(m==2&&n==2){  
		                        break dd;  
		                    }  
		                    System.out.println(m+" "+n);  
		                }  
		        }  
		    
		    //Not going to do it here but if you put for(;;){ it creates an infinitive loop
		    //Question: if you don't define a variable as private or public, what is the default?
		    
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
