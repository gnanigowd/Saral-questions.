package practical;

public class Report_Card_2 {

	public static void main(String[] args) {
		int average=0;
		int sum=0;
		int marks[][] = {

				{ 78, 76, 94, 86, 88 }, { 91, 71, 98, 65 },{95,45,78}, { 87, 67, 49,68,88 } };
		for (int i = 0; i <marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {

				sum = sum + marks[i][j];



			}

		

		average=sum/marks[i].length;
		System.out.println(average);
		sum=0;
		}

	}
}
