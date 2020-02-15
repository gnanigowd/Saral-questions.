package if_else;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner var = new Scanner (System.in);
		System.out.println("enter any age");
		int number = var.nextInt();
		if (number > 5 ) {
			System.out.println("go to school");
		}  if (number >18) {
			System.out.println("can vote");
		} if (number>21) {
			System.out.println("can car drive");
		}  if (number >=24) {
			System.out.println("marriage time");
		}  if (number > 25) {
			System.out.println("drink");
		
			
		}
		

	}

}
