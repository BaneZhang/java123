public class UsingSwitch {
	public static void main(String[] args) {
		int goodsNumber = 6;
		switch (goodsNumber) {
			case 1:
			case 2:
				System.out.println("食品分部");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("百货分部");
				break;
			default:
				System.out.println("无此商品");
				break;
		}
		System.out.println("Switch语句执行结束");
	}
}