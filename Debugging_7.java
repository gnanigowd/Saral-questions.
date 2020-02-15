package if_else;

import java.util.Scanner;

public class Debugging_7 {

	public static void main(String[] args) {
		Scanner var = new Scanner (System.in);
		System.out.println("enter any day" );
		String day=var.nextLine();
		 System.out.println("Kaunse samay ka khana banana hai? (lunch/dinner) ");
		 String time = var.nextLine();
		   if (day. equals("tuesday")&& time.equals ("dinner")) {
			   System.out.println("Pav-Bhaji banegi aaj toh ");
		   
		}  if ( day .equals("monday")|| time .equals ("lunch")) {
		   			System.out.println("Daal_Roti banega");
		  
				
		
		  }	

	}

}
