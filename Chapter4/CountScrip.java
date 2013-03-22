public class CountScrip {
	public static void main(String[] args) {
		int totalCost = 350;
		if (totalCost < 100) {
			System.out.println("No scrip.");
		} else if (totalCost < 500) {
			System.out.println("55 scrip.");
		} else if (totalCost < 1000) {
			System.out.println("155 scrip.");
		} else {
			System.out.println("355 scrip.");
		}
	}
}