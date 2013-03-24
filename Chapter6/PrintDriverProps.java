public class PrintDriverProps {
	public static void main(String[] args) {
		Driver driver = new Driver();
		// Driver driver = null;
		System.out.println(driver.age);
		if (driver.name != null) {
			System.out.println(driver.name);
		} else {
			System.out.println("没有司机的名字");
		}
		if (driver.car != null) {
			System.out.println(driver.car);
		} else {
			System.out.println("没有司机的车信息");
		}
	}
}