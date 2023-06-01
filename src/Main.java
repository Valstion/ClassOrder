public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        Book book1 = new Book();
        Book book2 = new Book("Pavadinimas 1", 100, 2000);
        Book book3 = new Book();
        book3.setTitle("Pavadinimas 2");
        book3.setPages(200);
        book3.setReleaseYear(2005);
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        for (Book book : books) {
            if (book != null) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Pages: " + book.getPages());
                System.out.println("Release Year: " + book.getReleaseYear());
                System.out.println();
            }
        }
    }
}