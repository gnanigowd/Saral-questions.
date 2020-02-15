package if_else;

public class Array_question2 {

	public static void main(String[] args) {
		int arr1 [] =new int[] {50,40,23,70,56,12,38,39,5,10,7} ;
		int count =0;
		int index = 0;
		for (index =0;  index < arr1.length; index++ ) {
			if ((arr1[index] > 20) && (arr1[index] < 40)) {
				count =count + 1;
			}
		}
			
		System.out.println(count );
		}

	

	}



