public class Book {
    private String title;
    private int pages;
    private int releaseYear;
    public Book() {
    }
    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}