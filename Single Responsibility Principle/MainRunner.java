import java.util.*;
class MainRunner{
    public static void main(String[] args) {
        
        Book book1 = new Book("Alex Xu", 2500, "System Design");
        Book book2 = new Book("Arthur", 6500, "OOPS");
        Book book3 = new Book("Facebook", 4500, "REACT JS");
        Book book4 = new Book("Arthur", 4000, "JavaScript Fundamentals");
        Book book5 = new Book("Arthur", 7000, "Java Fundamentals");

        
        Book.add(book2);
        Book.add(book1);
        Book.add(book3);
        Book.add(book4);
        Book.add(book5);

        for(Book book : Book.searchBookByAuthorName(Book.books, "Arthur")){
            System.out.println(book);
        }
    }
}