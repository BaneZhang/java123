public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][][] allStudents = new int[5][25][55];
		allStudents[0][1][5] = 85;

		System.out.println("Has value:" + allStudents[0][1][5]);
		System.out.println("No value:" + allStudents[1][1][5]);
	}
}