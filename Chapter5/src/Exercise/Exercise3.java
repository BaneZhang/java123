public class Exercise3 {
	public static void main(String[] args) {
		int dimension1 = 10, dimension2 = 2;
		int[][] intArray = new int[dimension1][dimension2];
		int[][] intArray2 = intArray;
		for (int i = 0; i < dimension1; i++) {
			for (int j = 0; j < dimension2; j++) {
				if (j == 0) {
					intArray[i][j] = 1;
					System.out.print(intArray[i][j] + "\t");
				} else {
					intArray2[i][j] = 2;
					System.out.print(intArray2[i][j] + "\t");
				}
			}
			System.out.print("\r\n");
		}
	}
}