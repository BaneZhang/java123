public class Exercise1 {
	public static void main(String[] args) {
		int totalCost = 199;
		if (totalCost < 200) {
			System.out.println("no scrip.");
		} else if (totalCost < 300) {
			System.out.println("20 scrip.");
		} else if (totalCost < 500) {
			System.out.println("50 scrip.");
		} else {
			System.out.println("100 scrip.");
		}
	}
}