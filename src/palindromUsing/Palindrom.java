package palindromUsing;

import java.util.Scanner;

public class Palindrom {
	
		 public static void main(String args[]){  
		  
			 Scanner scanner=new Scanner(System.in);
			 int r,sum=0,temp;
		  
			 System.out.println("Enter Number :- ");
		  
			 
		  int n=scanner.nextInt();  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		
}
