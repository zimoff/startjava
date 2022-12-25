package my.library;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Library {
    private List<LibraryItem> items = new ArrayList<>();

    void addItem(LibraryItem item) {
        items.add(item);
    }

    void delete(LibraryItem item) {
        items.remove(item);
    }

    List<LibraryItem> getItems() {
        return items;
    }

    //getBooks
    List<LibraryItem> getBooks() {
        List<LibraryItem> books = new ArrayList<>();
        for(LibraryItem item: items)
            if(item instanceof Book)
                books.add(item);
        return books;
    }
    //getMusicAlbum
    List<LibraryItem> getMusicAlbum() {
        List<LibraryItem> musicAlbum = new ArrayList<>();
        for(LibraryItem item: items)
            if(item instanceof MusicAlbum)
                musicAlbum.add(item);
        return musicAlbum;
    }

    //test method findByAuthor
    List<LibraryItem> findByAuthor(String authorName) {
        List<LibraryItem> foundArthors = new ArrayList<>();
        for(LibraryItem item: items) {
            if(authorName.equals(item.getAuthor()))
                foundArthors.add(item);
        }
        return foundArthors;
    }

    //test method findWithNameContains
    List<LibraryItem> findWithNameContains(String string) {
        List<LibraryItem> foundNames = new ArrayList<>();
        for(LibraryItem it: items) {
            if(it.getName().contains(string))
                foundNames.add(it);
        }
        return foundNames;
    }

    //test for items
    void showIndex(List<LibraryItem> items) {
        for(LibraryItem it: items) {
            if(it instanceof Book)
                System.out.println("Book|" + items.indexOf(it) + "| " + it.getName() + "| " + it.getClass());

            if(it instanceof MusicAlbum)
                System.out.println("Music|" + items.indexOf(it) + "| " + it.getName() + "| " + it.getClass());
        }
    }

    static void show(List<LibraryItem> items) {
        System.out.println("-----------");
        for(LibraryItem it: items) {
            System.out.println(it.getDescription());
            System.out.println("-----------");
        }
    }

}


