public class Book {
	String bookName = "";
	int pageCount = 0;
	double price = 0.0;

	public Book() {
		this("《Java入门123》", 690, 69.0);
	}

	public Book(String bookName, int pageCount, double price) {
		if (bookName != null) {
			this.bookName = bookName;
		}
		if (pageCount > 0) {
			this.pageCount = pageCount;
		}
		if (price >= 0.0) {
			this.price = price;
		}
	}

	public void setBookName(String bookName) {
		if (bookName != null) {
			this.bookName = bookName;
		}
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setPageCount(int pageCount) {
		if (pageCount > 0) {
			this.pageCount = pageCount;
		}
	}

	public int getPageCount() {
		return this.pageCount;
	}

	public void setPrice(double price) {
		if (price >= 0.0) {
			this.price = price;
		}
	}

	public double getPrice() {
		return this.price;
	}
}