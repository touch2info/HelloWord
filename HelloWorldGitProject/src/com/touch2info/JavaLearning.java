package com.touch2info;

public class JavaLearning {
	
	public static void main(String[] args) {
		
		//while loop syntax while(condition){code...}
		
		  int i=1;  
		    while(i<=3){  
		        System.out.println(i);  
		    i++;  
		    }  
		    
		    
		    System.out.println("\n");
		    
		//if you put while(true) then it will create an infinite loop
		    
		/*the do-while loop is same as while loop except it executes the code at least once bc 
		 * condition is checked after the first iteration
		 */
		int j=1;
		
		do {
			System.out.println(j);
		j++;
		}while(j<=3);
		
		//you can put "true" after while to make do-while loop infinitive too
		
		System.out.println("\n");
		
		//Using the continue statement
		
		 //for loop  
	    for(int k=1;k<=4;k++){  
	        if(k==2){  
	            //using continue statement  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(k);  
		
	    }
		
	    System.out.println("\n");
	    
	  //using continue in a inner for loop
	  //You can use continue for while and do-while loops too
	  //outer loop  
        for(int m=1;m<=3;m++){    
                //inner loop  
                for(int n=1;n<=3;n++){    
                    if(m==2&&n==2){    
                        //using continue statement inside inner loop  
                        continue;    
                    }    
                    System.out.println(m+" "+n);    
                }    
                
        }
        
        //What is the difference between runtime and compile?
		
    
        
		
	}

}
