public class Exercise2 {
	public static void main(String[] args) {
		int dimension1 = 10, dimension2 = 2;
		int[][] intArray = new int[dimension1][dimension2];
		for (int i = 0; i < dimension1; i++) {
			for (int j = 0; j < dimension2; j++) {
				intArray[i][j] = 1;
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.print("\r\n");
		}
	}
}