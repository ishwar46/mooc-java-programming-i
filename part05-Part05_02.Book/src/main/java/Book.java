public class Book {
  private String author;
  private String title;
  private int pages;

  public Book(String authorName, String bookTitle, int numPages) {
    this.author = authorName;
    this.title = bookTitle;
    this.pages = numPages;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getName() {
    return this.title;
  }

  public int getPages() {
    return this.pages;
  }

  public String toString() {
    return this.author + ", " + this.title + ", " + this.pages + " pages";
  }
}
