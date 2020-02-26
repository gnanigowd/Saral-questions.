package practical;

public class Sum_array {

	public static void main(String[] args) {
		
		int sum = 0;
		int count1= 0;
		int[] sum_add= {23, 14, 56, 12, 19, 9, 15, 25, 31, 42, 43};
		
		for(int i = 0;i<sum_add.length;i++) {
		
			if (sum_add[i]%2==0) {
				sum=sum+sum_add[i];
			}else {
				count1=count1+sum_add[i];
				
			}
		}
	System.out.println( " even numbers "+sum );
	System.out.println( " odd numbers "+count1 );


	}

}
