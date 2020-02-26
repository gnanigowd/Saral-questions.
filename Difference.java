package practical;



public class Difference {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1,2,3,4,5,6};
		int[] arr2 = new int[] {2,3,1,0,6,7};
		
		for (int i =0;i<arr1.length;i++) {
			int num=0;
		
			for (int j = 0; j<arr2.length;j++) {
				if (arr1[i]== arr2[j])
					num++;
				}
				if(num==0)
					System.out.println(arr1[i]);
	
	}
}

	}

