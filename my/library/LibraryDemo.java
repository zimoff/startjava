package my.library;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();

        //adding books
        library.addBook(new Book("Herbert George Wells","The Time Machine" ,78));
        library.addBook(new Book("Herbert George Wells","The War of the Worlds" ,147));
        library.addBook(new Book("Jules Verne","The Mysterious Island" ,492));
        library.addBook(new Book("Murray Leinster","The Aliens" ,58));
        library.addBook(new Book("Edgar Rice Burroughs", "The Gods of Mars", 227));

        System.out.println("List of added books: ");
        Library.showIndex(library.getBooks());

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by author Herbert George Wells
        System.out.println("finding by author: Herbert George Wells");
        Library.show(library.findByAuthor("Herbert George Wells", library.getBooks()));

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by name 
        System.out.println("finding by name: The War");
        Library.show(library.findWithNameContains("The War", library.getBooks()));

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //deleting books
        System.out.println("Deliting books: ");
        Library.showIndex(library.getBooks());

        library.deleteBook(library.getBooks().get(0));
        library.deleteBook(library.getBooks().get(0));

        System.out.println("=========");

        Library.showIndex(library.getBooks());

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //adding music
        library.addMusic(new Music("Nova Twins","Supernova"));
        library.addMusic(new Music("Watain","Rouge Carpet Disaster"));
        library.addMusic(new Music("hz_chto_za_nazvanie","The Agony & Ecstasy Of Watain"));
        library.addMusic(new Music("Wilderun","Supernova"));
        library.addMusic(new Music("Dark Funeral","We Are The Apocalypse"));

        System.out.println("List of added music");
        Library.showIndex(library.getMusic());

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        System.out.println("finding by author: Herbert George Wells");
        Library.show(library.findByAuthor("Supernova", library.getMusic()));
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        
        System.out.println("finding by name: Dark");
        Library.show(library.findWithNameContains("Dark", library.getMusic()));
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //deleting books
        System.out.println("Deliting music: ");
        Library.showIndex(library.getMusic());

        library.deleteMusic(library.getMusic().get(0));
        library.deleteMusic(library.getMusic().get(0));

        System.out.println("=========");

        Library.showIndex(library.getBooks());
    }
}
