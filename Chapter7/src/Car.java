public class Car {
	int speed;
	String color;
	String name;
	String direction;
	boolean isTrafficAdmin;

	public Car() {

	}

	public Car(String p_name, String p_color) {
		this(p_name, p_color, false);
	}

	public Car(String p_name, String p_color, boolean p_trafficAdmin) {
		this.name = p_name;
		this.color = p_color;
		this.isTrafficAdmin = p_trafficAdmin;
	}

	public void driveCar() {
		speed = 50;
		direction = "南方";
	}

	public void raiseSpeed(int p_speed) {
		if (p_speed < 0) {
			System.out.println("p_speed的值小于0，raiseSpeed()方法将结束");
			return;
		}
		int currentSpeed = speed + p_speed;
		speed = currentSpeed;
	}

	public void setSpeedAndDirection(int p_speed, String p_direction) {
		speed = p_speed;
		direction = p_direction;
	}

	public boolean isOverspeed() {
		if (speed > 80) {
			return true;
		} else {
			return false;
		}
	}

	public void overtakeCar(Car anotherCar) {
		speed = anotherCar.speed + 5;
		direction = anotherCar.direction;
	}

	public void setNameForAnotherCar(Car anotherCar, String newName) {
		if (!isTrafficAdmin) {
			System.out.println("你不是交通管理员，无权调用此方法！");
			return;
		}
		anotherCar.name = newName;
	}

	public void stopAnotherCar(Car anotherCar) {
		if (!isTrafficAdmin) {
			System.out.println("你不是交通管理员，无权调用此方法！");
			return;
		}
		anotherCar.speed = 0;
	}

	public CarStatus getAnotherCarStatus(Car anotherCar) {
		if (!isTrafficAdmin) {
			// System.out.println("你不是交通管理员，无权调用此方法！");
			// CarStatus status = new CarStatus(0, "");
			// return status;
			anotherCar.speed = 0;
		}
		CarStatus status = new CarStatus(anotherCar.speed, anotherCar.direction);
		return status;
	}

	public boolean isLegalCarStatus(CarStatus status) {
		if (status.speed <= 80) {
			return true;
		} else {
			return false;
		}
	}

	public void setSpeed(int p_speed) {
		if (p_speed < 0) {
			System.out.println("汽车速度不能为负值，方法将退出");
			return;
		}
		this.speed = p_speed;
	}

	public void printCarRunningMessage() {
		System.out.println("车名为“" + this.name + "”的汽车行驶速度为：" + this.speed + "，汽车行驶方向为：“" + this.direction + "”");
	}
}