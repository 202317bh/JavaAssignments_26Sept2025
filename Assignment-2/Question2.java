package First_Assessment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String user;
		char char_user;
		int count=0;
		
		// 	Accept a string from user 
		
		System.out.println("Enter the string: ");
		user=sc.nextLine();
		System.out.println("Enter the character: ");
		char_user=sc.next().charAt(0);
		
		
		for(int i=0;i<user.length();i++) {
			if(user.charAt(i)==char_user) {
				count++;
				
			}
			
	      }
		    if (count>0) {
		    	System.out.println("The number of times the character " +char_user+ "appears in the string is " +count);
      	        
			    
		}else {
			System.out.println("The character " + char_user + "doesn't appear in the string");
		}

	}

}
