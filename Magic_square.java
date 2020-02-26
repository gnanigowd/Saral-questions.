package practical;


public class Magic_square {

	public static void main(String[] args) {
		int[] [] m = {
		             	{8, 3, 4},
		                {1, 5, 9},
		                {6, 7,2} };
		int a = m[0][0] + m[1][1] + m[2][2];
		int b = m[0][2]+m[1][1]+m[2][0];
		int c = m [0][0]+ m[1][0]+m[2][0];
		System.out.println( a);
		System.out.println(b);
		System.out.println(c);
	}

}
