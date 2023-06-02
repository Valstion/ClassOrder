public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book("pavadinimas", 250 ,1991);
        Book book5 = new Book("pavadinimas", 250 ,1992);
        Book book6 = new Book("pavadinimas", 250 ,1993);
        book1.setTitle("Pavadinimas 2");
        book1.setPages(200);
        book1.setReleaseYear(2005);
        book2.setTitle("Pavadinimas 2");
        book2.setPages(100);
        book2.setReleaseYear(2005);
        book3.setTitle("Pavadinimas 2");
        book3.setPages(100);
        book3.setReleaseYear(2006);
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        books[5] = book6;
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