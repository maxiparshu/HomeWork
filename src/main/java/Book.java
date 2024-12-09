public class Book {
  private String title;
  private String author;
  private String year;
  private boolean isAvailable = true;

  Book(String title, String author, String year, boolean isAvailable){
    this.title = title;
    this.author = author;
    this.year = year;
    this.isAvailable = isAvailable;
  }

  Book(String title, String author){

    this.title = title;
    this.author = author;
    this.year = "2024";
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

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  void borrowBook(){
    if (isAvailable)
      isAvailable = false;
    else
      System.out.println("Book is borrowed already");
  }
  void returnBook(){
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
