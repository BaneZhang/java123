public class Exercise3 {
	public static void main(String[] args) {
		int i = 1, j = 1;
		while (i < 10) {
			j = 1;
			while (j < 10) {
				System.out.print((i * j) + "\t");
				j++;
			}
			System.out.print("\r\n");
			i++;
		}
	}
}