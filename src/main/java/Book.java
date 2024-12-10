public class Book {
  private String title;
  private String author;
  private Integer year;
  private boolean isAvailable;

  Book(String title, String author, Integer year, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.year = year;
    this.isAvailable = isAvailable;
  }

  Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.year = 2024;
    this.isAvailable = true;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  public void borrowBook() {
    if (isAvailable) {
      isAvailable = false;
    } else {
      System.out.println("Book is borrowed already");
    }
  }

  public void returnBook() {
    isAvailable = true;
  }

  public void displayInfo() {
    System.out.println("Book info");
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Year: " + year);
    System.out.println();
  }
}
