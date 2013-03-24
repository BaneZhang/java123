public class Exercise2 {
	public static void main(String[] args) {
		Book book = new Book();
		book.bookName = "《Java入门123》";
		book.pageCount = 615;
		book.price = 69.0;

		System.out.println("书名：" + book.bookName);
		System.out.println("页数：" + book.pageCount);
		System.out.println("价格：" + book.price);
	}
}