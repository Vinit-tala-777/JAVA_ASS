class BooksDetail {
    String title;
    String author;
    String publisher;
    double price;

    void display() 
    {
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Publisher : " + publisher);
        System.out.println("Price     : " + price);
    }

    public static void main(String[] args)
     {
        BooksDetail book = new BooksDetail();

        book.title = "Java Programming";
        book.author = "James Gosling";
        book.publisher = "Oracle Press";
        book.price = 499.50;

        book.display();
    }
}