package practical;

public class KitneAdmiTha {

	public static void main(String[] args) {
		int count = 0;
		int count1= 0;
		int elements[]=new int[] {23, 14, 56, 12, 19, 9, 15, 25, 31, 42, 43};
		for(int i = 0;i<elements.length;i++) {
		
			if (elements[i]%2==0) {
				count = count+1;
			}else {
				count1 = count1+1;
			}
		}
	System.out.println(count + " even numbers ");
	System.out.println(count1 + " odd numbers ");

}
}
