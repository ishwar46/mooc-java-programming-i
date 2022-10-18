public class Book {
  private String title;
  private int pages;
  private int year;

  public Book(String bookTitle, int pagesNum, int publicYear) {
    this.title = bookTitle;
    this.pages = pagesNum;
    this.year = publicYear;
  }

  public String getTitle() {
    return this.title;
  }

  public int getPages() {
    return this.pages;
  }

  public int getYear() {
    return this.year;
  }
}
