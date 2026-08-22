class Book {
	String title;
	String author;
	double price;
 
	void display() {
    	System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
	}
}
 
public class BookDemo {
	public static void main(String[] args) {
    	// Create the first Book object
        Book book1 = new Book();
        book1.title = "Effective Java";
        book1.author = "Joshua Bloch";
        book1.price = 899.0;
 
    	// Create the second Book object
        Book book2 = new Book();
        book2.title = "Clean Code";
        book2.author = "Robert C. Martin";
        book2.price = 749.0;
 
    	// Display details of both objects
        System.out.println("--- Book 1 ---");
        book1.display();
        System.out.println("--- Book 2 ---");
        book2.display();
	}
}
