class BookAvail {
    int bookId;
    String title;
    String author;
    boolean available;

    void display() {
        if (available) {
            System.out.println("Book ID     : " + bookId);
            System.out.println("Title       : " + title);
            System.out.println("Author      : " + author);
            System.out.println("Availability: Available");
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {

        BookAvail book1 = new BookAvail();
        book1.bookId = 101;
        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.available = true;

        BookAvail book2 = new BookAvail();
        book2.bookId = 102;
        book2.title = "C Programming";
        book2.author = "Dennis Ritchie";
        book2.available = false;

        BookAvail book3 = new BookAvail();
        book3.bookId = 103;
        book3.title = "Python Programming";
        book3.author = "Guido van Rossum";
        book3.available = true;

        book1.display();
        book2.display();
        book3.display();
    }
}