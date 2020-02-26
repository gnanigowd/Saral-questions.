package practical;

public class count_sum_avg_odd_even {

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
		System.out.println(count + " count of even numbers");
		System.out.println(count2 + "count of odd numbers");
		System.out.println(count + count2 + " total numbers");
		System.out.println(sum + "sum of even numbers");
		System.out.println(sum2 + "sum of odd numbers");
		System.out.println(sum+sum2 + " sum of total numbers");
		System.out.println( average + " average is of  even numbers ");
	System.out.println( average1  + " average is of odd numbers " );
	System.out.println(average + average1 +" average of total numbers");


		

	}

}
