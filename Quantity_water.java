package if_else;

import java.util.Scanner;

public class Quantity_water {

	public static void main(String[] args) {
		Scanner var = new Scanner (System.in);
		System.out.println("enter any volume of water");
		int litre = var.nextInt();
		if  (litre < 1l   ){
			System.out.println("no need to fill");
			
		} else if (litre >=1 && litre<10) {
				System.out.println("water filled");
	
		}else {
			System.out.println("overflow");
		}
		}
		
	

	}


