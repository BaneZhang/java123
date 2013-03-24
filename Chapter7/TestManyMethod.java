public class TestManyMethod {
	public static void main(String[] args) {
		Car normalCar = new Car("普通车", "白色");
		normalCar.setSpeedAndDirection(55, "菜市场");
		normalCar.printCarRunningMessage();

		Car crazyCar = new Car("疯狂赛车", "黑色");
		crazyCar.setSpeedAndDirection(35, "赛车场");
		crazyCar.printCarRunningMessage();
		crazyCar.overtakeCar(normalCar);
		crazyCar.printCarRunningMessage();
		crazyCar.raiseSpeed((byte)50);
		crazyCar.printCarRunningMessage();
		crazyCar.raiseSpeed((int)55);
		
		Car trafficeAdmin = new Car("汽车管理员", "红色", true);
		trafficeAdmin.setSpeedAndDirection(55, "交通管理中心");
		CarStatus normalStatus = trafficeAdmin.getAnotherCarStatus(normalCar);
		boolean isLegal = trafficeAdmin.isLegalCarStatus(normalStatus);
		if (isLegal) {
			trafficeAdmin.setNameForAnotherCar(normalCar, "驾车典范");
		}
		normalCar.printCarRunningMessage();
		CarStatus crazyStatus = trafficeAdmin.getAnotherCarStatus(crazyCar);
		isLegal = trafficeAdmin.isLegalCarStatus(crazyStatus);
		crazyCar.stopAnotherCar(trafficeAdmin);
		if (!isLegal) {
			trafficeAdmin.setNameForAnotherCar(crazyCar, "疯狂超速车");
			trafficeAdmin.stopAnotherCar(crazyCar);
			crazyCar.printCarRunningMessage();
		}
		
		normalCar.setSpeed(0);
		normalCar.printCarRunningMessage();
	}
}