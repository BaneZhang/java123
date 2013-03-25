public class Exercise3 {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = book1;
		book1.bookName = "《Java入门123》";
		book2.pageCount = 615;
		book2.price = 69.0;

		System.out.println("书名：" + book1.bookName);
		System.out.println("页数：" + book2.pageCount);
		System.out.println("价格：" + book1.price);
	}
}