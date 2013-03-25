public class Exercise3 {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookName("《探索式软件测试》");
		book.setPageCount(469);
		book.setPrice(45.0);

		System.out.println(book.getBookName() + '\t' + book.getPageCount() + '\t' + book.getPrice());
	}
}