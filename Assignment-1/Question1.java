package First_Assessment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// store the number in 3 rows * 4 columns, 2D int array
		
		int value;
		int sum=0;
		int count = 0;
		Scanner sc= new Scanner(System.in);
		
		int [][] arr = new int[3][4];
		arr[0][0]= 1; arr[0][1]= 2; arr[0][2]= 3; arr[0][3]= 4;
		arr[1][0]= 5; arr[1][1]= 6; arr[1][2]= 7; arr[1][3]= 8;
		arr[2][0]= 9; arr[2][1]=10; arr[2][2]=11; arr[2][3]= 12;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				 value=arr[i][j];
				 System.out.println(value);
				
				if(arr[i][j]%3==0) {
		        	sum+=arr[i][j];
		        }
				if(arr[i][j]%5==0) {
	        		count++;
			  }
			
	        }
			
		}
		System.out.println();
		System.out.println("Sum =" +sum);
		System.out.println("Count = " +count);
				
		
	}

}
