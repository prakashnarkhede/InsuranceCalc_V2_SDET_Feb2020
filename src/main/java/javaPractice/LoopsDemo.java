package javaPractice;

import java.util.Arrays;

public class LoopsDemo {

	public static void main(String[] args) {
		//while loop  --> condition is checked first
		
		// print numbers till 10, starting from 2
		// if num <=10
		int num = 2;
		while (num<=10) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("************************************************");
		//do while loop--> executed once before condition is checked
		
		int num1 = 2;
		do {
			System.out.println(num1);
			num1++;
		} while (num1<=10);
		
		
		
		
		System.out.println("************************************************");

		//for loop
		//1. init --> int i = 0;
		//2. testing expression
		//3. update
		for (int i = 2; i <= 10; i++) {
			System.out.println(i);
		}
		
		//find factorial of number
		// 4! = 4*3*2*1 = 24;
		//5! = 120;
		int number = 5;
		int fact = 1;
		
		for(int i = 1; i <=number; i++) {
			fact = fact *i;
		}
		System.out.println("fact is: "+fact);
		
		
		
		//forEach loop ==> enhanced for loop
		// --> used to iterate on collections -- list, array, set
		String hobbies = "speeding;Other";
		String[] arrHobbies = hobbies.split(";");
		
		for(int i= 0; i < arrHobbies.length; i++) {
			System.out.println("Using for loop: "+arrHobbies[i]);
		}
		
		//for each
		for(String str: arrHobbies) {
			System.out.println("Using forEach loop: "+str);
		}
		
		
		
	}

}
