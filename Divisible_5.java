package if_else;

import java.util.Scanner;

public class Divisible_5 {

	public static void main(String[] args) {
		Scanner num =new Scanner (System.in);
		System.out.println("enter any number");
		int number =num.nextInt();
		int min =5;
		int max = 15;
		if (number% min ==0) {
			if (number % max==0) {
			System.out.println("divisible of max and min");
		} else {
			System.out.println("not divisible");
		}
		}

	}

}
