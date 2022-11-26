package my.library;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Library {
    private ArrayList<Book> Books = new ArrayList<>();

    //obj
    void addBook(Book bookObj) {
        Books.add(bookObj);
    }

    void deleteBook(Book bookObj) {
        Books.remove(bookObj);
    }

    ArrayList<Book> getBooks() {
        return Books;
    }

    void showBooks(List<Book> listOfBooks) {
        System.out.println("-----------");
        for(Book bk1: listOfBooks) {
            System.out.println(bk1.getDescription());
            System.out.println("-----------");
        }
    }

    List<Book> findBooksByAuthor(String name) {

        List<Book> autorsBooks = new ArrayList<>();
        for(Book bk: Books) {
            if(name.equals(bk.getAuthor()))
                autorsBooks.add(bk);
        }
        return autorsBooks;
    }

    List<Book> findBooksByName(String name) {
        List<Book> autorsBooks = new ArrayList<>();
        for(Book bk: Books) {
            if(bk.getName().contains(name))
                autorsBooks.add(bk);
        }
        return autorsBooks;
    }

    public static void main(String[] args) {

        Library lib = new Library();

        //adding books
        lib.addBook(new Book("Herbert George Wells","The Time Machine" ,78));
        lib.addBook(new Book("Herbert George Wells","The War of the Worlds" ,147));
        lib.addBook(new Book("Jules Verne","The Mysterious Island" ,492));
        lib.addBook(new Book("Murray Leinster","The Aliens" ,58));
        lib.addBook(new Book("Edgar Rice Burroughs", "The Gods of Mars", 227));

        System.out.println("List of added books: \n");
        for(Book bk: lib.getBooks()) 
            System.out.println("|" + lib.getBooks().indexOf(bk) + "| " + bk.getName());
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by author Herbert George Wells
        System.out.println("finding by author: Herbert George Wells");
        lib.showBooks(lib.findBooksByAuthor("Herbert George Wells"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by name 
        System.out.println("\nfinding by name: The War");
        lib.showBooks(lib.findBooksByName("The War"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //deliting books
        System.out.println("\nDeliting books: ");
        for(Book bk: lib.getBooks()) 
            System.out.println("|" + lib.getBooks().indexOf(bk) + "| " + bk.getName());

        lib.deleteBook(lib.getBooks().get(0));
        lib.deleteBook(lib.getBooks().get(0));

        System.out.println("=========");

        for(Book bk: lib.getBooks()) 
            System.out.println("|" + lib.getBooks().indexOf(bk) + "| " + bk.getName());
        System.out.println("|test|test|test|");
        //lib.testMeth(lib.getBooks());

    }
}
