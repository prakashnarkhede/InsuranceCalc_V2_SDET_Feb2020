package javaPractice;

import java.util.Scanner;

public class StarPatternExample {

	public static void main(String[] args) {
	
//		 *
//	    * *
//	   * * *
//	  * * * *
		
		// Creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");

        // Takes input from the keyboard
        int number = input.nextInt();
        
		for(int i = 0; i<number; i++) {
			for(int j = 0; j<number-i; j++) {
				System.out.print(" ");
			}
			for(int k= 0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
