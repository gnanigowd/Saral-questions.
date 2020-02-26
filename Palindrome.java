package practical;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any word");
		String name = sc. nextLine();
		String  reverse = "";
		for (int i= name.length()-1; i>=0; i--) {
			reverse += name.charAt(i);
		}
		 if (name. equals (reverse)) {
			 System.out.println("it is palindrome");
		 }else {
			 System.out.println("it is not a palindrome");
		 }
		}
	}




