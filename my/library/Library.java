package my.library;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void deleteBook(Book book) {
        books.remove(book);
    }

    List<Book> getBooks() {
        return books;
    }


    List<Book> findBooksByAuthor(String authorName) {

        List<Book> autorsBooks = new ArrayList<>();
        for(Book book: books) {
            if(authorName.equals(book.getAuthor()))
                autorsBooks.add(book);
        }
        return autorsBooks;
    }

    List<Book> WithNameContains(String string) {
        List<Book> autorsBooks = new ArrayList<>();
        for(Book book: books) {
            if(book.getName().contains(string))
                autorsBooks.add(book);
        }
        return autorsBooks;
    }

    static void showBooks(List<Book> books) {
        System.out.println("-----------");
        for(Book book: books) {
            System.out.println(book.getDescription());
            System.out.println("-----------");
        }
    }

    public static void main(String[] args) {

        Library library = new Library();

        //adding books
        library.addBook(new Book("Herbert George Wells","The Time Machine" ,78));
        library.addBook(new Book("Herbert George Wells","The War of the Worlds" ,147));
        library.addBook(new Book("Jules Verne","The Mysterious Island" ,492));
        library.addBook(new Book("Murray Leinster","The Aliens" ,58));
        library.addBook(new Book("Edgar Rice Burroughs", "The Gods of Mars", 227));

        System.out.println("List of added books: \n");
        for(Book book: library.getBooks()) 
            System.out.println("|" + library.getBooks().indexOf(book) + "| " + book.getName());
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by author Herbert George Wells
        System.out.println("finding by author: Herbert George Wells");
        Library.showBooks(library.findBooksByAuthor("Herbert George Wells"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by name 
        System.out.println("\nfinding by name: The War");
        Library.showBooks(library.WithNameContains("The War"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //deleting books
        System.out.println("\nDeliting books: ");
        for(Book book: library.getBooks()) 
            System.out.println("|" + library.getBooks().indexOf(book) + "| " + book.getName());

        library.deleteBook(library.getBooks().get(0));
        library.deleteBook(library.getBooks().get(0));

        System.out.println("=========");

        for(Book book: library.getBooks()) 
            System.out.println("|" + library.getBooks().indexOf(book) + "| " + book.getName());

    }
}
