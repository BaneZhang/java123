public class DoubleArray {
	public static void main(String[] args) {
		int[][] students = new int[2][3];
		students[0][1] = 10;

		System.out.println("The 1,2 student score is:" + students[0][1]);
		System.out.println("The defalut score is:" + students[0][0]);
	}
}