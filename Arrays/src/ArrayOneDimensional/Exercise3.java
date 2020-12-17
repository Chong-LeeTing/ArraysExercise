package ArrayOneDimensional;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		//write a program that create an array of 10 element size, your program should promt the users to input numbers in array and
		//display the sum of all array element
		
		int[] number = new int[10];

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter numbers: ");
		for(int i = 0; i < number.length; i++) {
			number[i] = in.nextInt();		
		}
		for(int i = 0; i <number.length; i++) {
			System.out.println(number[i]);
		}
		int sum = 0;
		for(int i =0; i < number.length; i++) {
			sum = sum + number[i];
		}System.out.println("The sum equals to: "+sum);
		
		in.close();

	}

}
