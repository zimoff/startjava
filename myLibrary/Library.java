package myLibrary;
import java.util.Scanner;
import java.util.ArrayList;
class Library {
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

        //adding books
        ArrayList<Book> Books = new ArrayList<>();
        Books.add(new Book(author1, name1 ,pageNum1));
        Books.add(new Book(author2, name2 ,pageNum2));
        Books.add(new Book(author3, name3 ,pageNum3));
        Books.add(new Book(author4, name4 ,pageNum4));
        Books.add(new Book(author5, name5 ,pageNum5));
        System.out.println("List of added books: \n");
        for(Book bk: Books) {
            System.out.println("|" + Books.indexOf(bk) + "| " + bk.getName());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by author
        System.out.println("finding book by author: ");
        int count = 0;
        for(Book bk: Books) {
            if("Herbert George Wells".equals(bk.getAuthor()))
                count++;
        }
        System.out.println("found: " + count + " books\n");
        for(Book bk: Books) {
            if("Herbert George Wells".equals(bk.getAuthor())) {
                System.out.println(bk.getDescription());
                System.out.println("-------------");
            }
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //finding by name 
        System.out.println("finding book by name: ");
        System.out.println("Search: The War\n");
        for(Book bk: Books) {
            if(bk.getName().contains("The War")) {
                System.out.println(bk.getDescription());
                System.out.println("-------------");
            }
        }

        //deliting books
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        System.out.println("Deliting books\n");
        Books.remove(0);
        Books.remove(0);

        System.out.println("List of books: \n");
        for(Book bk: Books) {
            System.out.println("|" + Books.indexOf(bk) + "| " + bk.getName());
        }
    }
}
