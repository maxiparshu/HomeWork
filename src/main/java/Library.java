import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.IntStream;

public class Library {
  static Book[] books;// ArrayList
  static Integer size;

  static {
    size = 3;
    books = new Book[size];
    var firstBook = new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling", 1998, false);
    var secondBook = new Book("The Hobbit", "J. R. R. Tolkien");
    var thirdBook = new Book("1984", "George Orwell", 1949, true);
    books[0] = firstBook;
    books[1] = secondBook;
    books[2] = thirdBook;
  }

  public void addBook(Book book) {
    var tempArray = new Book[size + 1];
    IntStream.range(0, size).forEach(i -> tempArray[i] = books[i]);
    tempArray[size] = book;
    size++;
    books = tempArray;
  }

  public Optional<Book> findBookByTitle(String title) {
    for (var book : books) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        return Optional.of(book);
      }
    }
    return Optional.empty();
  }

  public ArrayList<Book> findBooksByAuthor(String author) {
    var detectedBooks = new ArrayList<Book>();
    for (var book : books) {
      if (book.getAuthor().equalsIgnoreCase(author)) {
        detectedBooks.add(book);
      }
    }
    return detectedBooks;
  }

  public void printAvailableBooks() {
    System.out.println("Available books list: ");
    int index = 1;
    for (var book : books) {
      if (book.isAvailable()) {
        System.out.print(index + ") ");
        book.displayInfo();
        index++;
      }
    }
  }
}
