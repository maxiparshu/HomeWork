import java.util.ArrayList;

public class Main {
  private static void printBooksByAuthor(ArrayList<Book> books, String author) {
    if (books.isEmpty())
      System.out.println("No " + author + " books");
    else {
      System.out.println(author + " books:");
      books.forEach(Book::displayInfo);
    }
  }

  public static void main(String[] args) {
    var library = new Library();
    var firstBook = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling");
    var secondBook = new Book("The Green Mile", "Stephen King", "1996", false);
    var author = "J. K. Rowling";
    library.printAvailableBooks();
    printBooksByAuthor(library.findBooksByAuthor(author), author);
    System.out.println();

    library.addBook(firstBook);
    library.addBook(secondBook);
    library.printAvailableBooks();
    printBooksByAuthor(library.findBooksByAuthor(author), author);
    System.out.println();

    library.findBookByTitle("The Hobbit").borrowBook();
    library.findBookByTitle("The Green Mile").returnBook();
    library.printAvailableBooks();
  }
}
