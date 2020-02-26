package practical;

public class Average_odd_sum {

	public static void main(String[] args) {
		int sum = 0;
		int sum2= 0;
		int average = 0;
		int average1=0;
		int count = 0;
		int count2=0;
		int[] sum_add= {23, 14, 56, 12, 19, 9, 15, 25, 31, 42, 43};
		
		for(int i = 0;i<sum_add.length;i++) {
		
			if (sum_add[i]%2==0) {
				count = count+1;
				sum=sum+sum_add[i];
				average=sum/count;
			}else {
				count2 = count2+1;
				sum2=sum2+sum_add[i];
				average1=sum2/count2;
				
			}
		}
		System.out.println( average + " average is of  even numbers ");
	System.out.println( average1  + " average is of odd numbers " );


		

	}

}
