package practical;

public class smallest_element {

	public static void main(String[] args) {
		int arr1 [] =new int[] {50,40,23,70,56,12,38,39,5,1,10,7} ;
		int min =arr1[0];
		int a = 1;
		for (a=0;a<arr1.length;a++) {
			if (min>arr1 [a]) {
				
				min =arr1 [a];
			}
		}
		System.out.println(" smallest element is " +  min );
		

		
	}
	


}
