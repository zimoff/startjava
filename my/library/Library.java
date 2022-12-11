package my.library;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Library{
    private ArrayList<LibraryItem> books = new ArrayList<>();
    private ArrayList<LibraryItem> musics = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void addMusic(Music music) {
        musics.add(music);
    }

    void deleteBook(LibraryItem book) {
        books.remove(book);
    }

    void deleteMusic(LibraryItem music) {
        musics.remove(music);
    }

    List<LibraryItem> getBooks() {
        return books;
    }

    List<LibraryItem> getMusic() {
        return musics;
    }

    //test method findByAuthor
    <T extends LibraryItem> List<T> findByAuthor(String authorName, List<T> items) {
        List<T> foundArthors = new ArrayList<>();
        for(T item: items) {
            if(authorName.equals(item.getAuthor()))
                foundArthors.add(item);
        }
        return foundArthors;
    }

    //test method findWithNameContains
    <T extends LibraryItem> List<T> findWithNameContains(String string, List<T> items) {
        List<T> foundNames = new ArrayList<>();
        for(T it: items) {
            if(it.getName().contains(string))
                foundNames.add(it);
        }
        return foundNames;
    }

    static <T extends LibraryItem> void show(List<T> items) {
        System.out.println("-----------");
        for(T it: items) {
            System.out.println(it.getDescription());
            System.out.println("-----------");
        }
    }

    static <T extends LibraryItem> void showIndex(List<T> items) {
        for(T it: items) {
            System.out.println("|" + items.indexOf(it) + "| " + it.getName());
        }
    }
}


