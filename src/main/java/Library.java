import java.util.ArrayList;

public class Library {
  static ArrayList<Book> books;

  static {
    books = new ArrayList<>();
    var firstBook = new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling", "1998", false);
    var secondBook = new Book("The Hobbit", "J. R. R. Tolkien");
    var thirdBook = new Book("1984", "George Orwell", "1949", true);
    books.add(secondBook);
    books.add(firstBook);
    books.add(thirdBook);
  }

  public void addBook(Book book) {
    books.add(book);
  }
  public Book findBookByTitle(String title) {
    for (var book : books) {
      if (book.getTitle().equalsIgnoreCase(title)){
        return book;
      }
    }
    return null;
  }
  public ArrayList<Book> findBooksByAuthor(String author) {
    var detectedBooks = new ArrayList<Book>();
    for (var book : books) {
      if (book.getAuthor().equalsIgnoreCase(author)){
        detectedBooks.add(book);
      }
    }
    return detectedBooks;
  }

  public void printAvailableBooks() {
    System.out.println("Available books list: ");
    int index = 1;
    for (var book : books) {
      if (book.isAvailable()){
        System.out.print(index + ") ");
        book.displayInfo();
        index++;
      }
    }
  }
}
