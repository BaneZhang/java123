public class UseCar {
	public static void main(String[] args) {
		Car carPassedBy;
		carPassedBy = new Car();
		carPassedBy.speed = 60;
		carPassedBy.color = "白色";
		carPassedBy.name = "雪铁龙一号";
		carPassedBy.direction = "镇江方向";

		System.out.println("经过的汽车速度为：" + carPassedBy.speed);
		System.out.println("它产颜色是：" + carPassedBy.color);
		System.out.println("汽车的名字叫做：" + carPassedBy.name);
		System.out.println("汽车行驶方向为：" + carPassedBy.direction);
	}
}