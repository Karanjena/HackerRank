

/*Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.*/


package Statement;

import java.util.Scanner;

public class If_else_Statement {

	


	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);

	        int N = sc.nextInt();
	        
	            if(N%2!=0 ){
	                System.out.println("Weird");
	            }else if (N%2==0||N<=5||N>=2) {
	                System.out.println("Not Weird");
	            }else if (N%2==0 || N<=6 ||N>=20) {
	               System.out.println("Weird"); 
	            }else if(N%2==0||N>20){
	                System.out.println("Not Weird");
	            }else{
	            System.out.println("Default");
	        }
	    }
	}

