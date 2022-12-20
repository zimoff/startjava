package my.library;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();

        //adding books
        library.addItem(new Book("Herbert George Wells","The Time Machine" ,78));
        library.addItem(new Book("Herbert George Wells","The War of the Worlds" ,147));
        library.addItem(new Book("Jules Verne","The Mysterious Island" ,492));
        library.addItem(new Book("Murray Leinster","The Aliens" ,58));
        library.addItem(new Book("Edgar Rice Burroughs", "The Gods of Mars", 227));

        System.out.println("List of added books: ");
        library.showIndex(library.getItems());

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by author Herbert George Wells
        System.out.println("finding by author: Herbert George Wells");
        Library.show(library.findByAuthor("Herbert George Wells"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by name 
        System.out.println("finding by name: The War");
        Library.show(library.findWithNameContains("The War"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //deleting books
        System.out.println("Deliting books: ");
        library.showIndex(library.getItems());

        library.delete("Book");
        library.delete("Book");

        System.out.println("=========");

        library.showIndex(library.getItems());

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //adding music
        library.addItem(new MusicAlbum("Nova Twins","Supernova"));
        library.addItem(new MusicAlbum("Watain","Rouge Carpet Disaster"));
        library.addItem(new MusicAlbum("hz_chto_za_nazvanie","The Agony & Ecstasy Of Watain"));
        library.addItem(new MusicAlbum("Wilderun","Supernova"));
        library.addItem(new MusicAlbum("Dark Funeral","We Are The Apocalypse"));

        System.out.println("List of added music");
        library.showIndex(library.getItems());

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        System.out.println("finding by author: Supernova");
        Library.show(library.findByAuthor("Supernova"));
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        
        System.out.println("finding by name: Dark");
        Library.show(library.findWithNameContains("Dark"));
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //deleting books
        System.out.println("Deliting music: ");
        library.showIndex(library.getItems());

        library.delete("MusicAlbum");
        library.delete("MusicAlbum");

        System.out.println("=========");

        library.showIndex(library.getItems());
        
        //testing
        //System.out.println(">>>>>>>>>>>>>>>>>>>>");
        //System.out.println(":TEST TEST TEST ");
        //library.showIndex(library.getItems());
        //System.out.println(">>>>>>>>>>>>>>>>>>>>");
        //System.out.println(library.getItems().get(0).toString());



    }
}
