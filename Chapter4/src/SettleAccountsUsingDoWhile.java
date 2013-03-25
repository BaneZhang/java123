public class SettleAccountsUsingDoWhile {
	public static void main(String[] args) {
		int times = 5;
		do{
			int price = 5;
			int amount = 10;
			if (price > 0 && amount > 0) {
				int totalCost = price * amount;
				System.out.println(totalCost);
			} else {
				System.out.println("price和amount的值必须都大于0，否则无法计算totalCost。");
			}
			times = times - 1;
		}while(times > 0);
		System.out.println("do..`while语句执行结束。结账员可以休息一下了。");
	}
}