package First_Assessment;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		
		// The program should accept 2 no
		
		Scanner sc= new Scanner(System.in);
		
		int no1;
		int no2;
		int choice;
		int Add = 0;
		int sub;
		int mul;
		int Div;
		int exit;
		int result;
		 
		 System.out.println("1. Addition ");
		 System.out.println("2. Subtraction");
		 System.out.println("3. Multiplication");
		 System.out.println("4. Division ");
	     System.out.println("5. Exit ");
	     System.out.println();
	     
	     System.out.print("Enter your choice: ");
		 choice=sc.nextInt();
	       
		   System.out.print("Enter the First no: ");
		   no1=sc.nextInt();
	       System.out.print("Enter the second no: ");
	       no2=sc.nextInt();
	       
	      switch(choice) {
	      
	          case 1: 
	        	  result=no1+no2;
	        	  System.out.println(result);
	        	  break;
	      
	           
	          case 2: 
	        	  result=no1-no2;
	        	  System.out.println(result);
	        	  break;
	        	  
	          case 3: 
	        	  result=no1*no2;
	        	  System.out.println(result);
	        	  break;
	        	  
	          case 4:
	        	  if(no2 !=0) {
	        	    result=no1/no2;
	        	     System.out.println(result);
	               }else {
	    	  System.out.println("Error: division by 0 in not allowed.");
	      }
	        	  break;
	        	  
	          case 5: 
	        	  System.out.println("Exit");
	       
	        	  break; 
	       default:
	    	    System.out.println("Invalid choice.");

       }
	    
		
	}
}
