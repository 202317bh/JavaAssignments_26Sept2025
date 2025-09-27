package First_Assessment;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc= new Scanner(System.in);
		
		String num;
		int sum=0;
		int digit = 0;
		
		System.out.println("Enter thye number: ");
		num=sc.nextLine();
		
		for(int i=0;i<num.length();i++) {
			digit = num.charAt(i)-'0';
			
			if((i+1)%2==0) {
				sum+=digit;
			}
		  }
		System.out.println("Sum of digits at even position = " + sum);
	  
	}		

}
