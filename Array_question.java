package if_else;

public class Array_question {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 2, 3, 1, 0, 6, 7 };

		for ( int i = 0; i < arr1.length; i++) {
			int var = 0;

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					var++;
				}
			}

			if (var == 0) {
				System.out.print(arr1[i] + " ");
			}

		}
	}
}
