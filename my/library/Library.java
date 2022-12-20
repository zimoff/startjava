package my.library;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Library{
    private ArrayList<LibraryItem> items = new ArrayList<>();

    void addItem(LibraryItem item) {
        items.add(item);
    }

    void delete(String type) {
        if(type.equals("Book")) {
            for(LibraryItem item: items)
                if(item instanceof Book) {
                    items.remove(item);
                    break;
                }
        }
        if(type.equals("MusicAlbum")) {
            for(LibraryItem item: items)
                if(item instanceof MusicAlbum) {
                    items.remove(item);
                    break;
                }
        }
    }

    List<LibraryItem> getItems() {
        return items;
    }

    //getBooks
    //getMusicAlbum

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


