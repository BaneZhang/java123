public class MultiNameArray {
	public static void main(String[] args) {
		int[] students ={55, 66, 77, 88, 99};
		int[] studentsSame;
		studentsSame = students;

		System.out.println("The first student score is:" + studentsSame[0]);
		System.out.println("The third student score is:" + studentsSame[2]);
		System.out.println("The fifth student score is:" + studentsSame[4]);
	}
}