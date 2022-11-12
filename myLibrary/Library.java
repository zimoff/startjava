package myLibrary;
import java.util.Scanner;
import java.util.ArrayList;
class Library {
    private ArrayList<Book> Books = new ArrayList<>();

    void addBook(Book obj) {
        Books.add(obj);
    }

    void deliteBook(int i) {
        Books.remove(i);
    }

    void showBooks() {
        for(Book bk: Books) {
            System.out.println("|" + Books.indexOf(bk) + "| " + bk.getName());
        }
    }

    void findAuthor(String name) {
        int count = 0;
        for(Book bk: Books) {
            if(name.equals(bk.getAuthor()))
                count++;
        }
        System.out.println("found: " + count + " books\n");
        for(Book bk: Books) {
            if(name.equals(bk.getAuthor())) {
                System.out.println(bk.getDescription());
                System.out.println("-------------");
            }
        }
    }

    void findName(String name) {
        for(Book bk: Books) {
            if(bk.getName().contains(name)) {
                System.out.println(bk.getDescription());
                System.out.println("-------------");
            }
        }
    }



    public static void main(String[] args) {

        //Demo books
        String name1 = "The Time Machine"; 
        String author1 = "Herbert George Wells";
        int pageNum1 = 78;
        
        String name2 = "The War of the Worlds"; 
        String author2 = "Herbert George Wells";
        int pageNum2 = 147;

        String name3 = "The Mysterious Island"; 
        String author3 = "Jules Verne";
        int pageNum3 = 492;

        String name4 = "The Aliens"; 
        String author4 = "Murray Leinster";
        int pageNum4 = 58;

        String name5 = "The Gods of Mars"; 
        String author5 = "Edgar Rice Burroughs";
        int pageNum5 = 227;

        Library lib = new Library();

        //adding books
        lib.addBook(new Book(author1, name1 ,pageNum1));
        lib.addBook(new Book(author2, name2 ,pageNum2));
        lib.addBook(new Book(author3, name3 ,pageNum3));
        lib.addBook(new Book(author4, name4 ,pageNum4));
        lib.addBook(new Book(author5, name5 ,pageNum5));

        System.out.println("List of added books: \n");
        lib.showBooks();
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by author Herbert George Wells
        System.out.println("finding by author:");
        lib.findAuthor("Herbert George Wells");

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by name 
        System.out.println("\nfinding by name: ");
        lib.findName("The War");

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //deliting books
        System.out.println("\nDeliting books: ");
        lib.showBooks();

        lib.deliteBook(0);
        lib.deliteBook(0);

        System.out.println("=========");

        lib.showBooks();

    }
}
