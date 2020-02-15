package loops;

public class Prime_2 {

	public static void main(String[] args) {
		int num =11;
		int i =2;
		int a = 0;
		for (i=2;i<num;i=i+2) {
				
			if (num%i==0) {
//				System.out.println("num + prime not number");
				a=a+1;
			}
//						else {
//				System.out.println(" prime");
//			}
		}
//		else {
//			System.out.println(" prime");
//		}
		
		if(a == 0) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}
	}

}
