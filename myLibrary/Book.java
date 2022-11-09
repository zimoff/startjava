package myLibrary;
class Book {
    private String author;
    private String name;
    private int pageNum;

    Book(String author, String name, int pageNum) {
        this.author = author;
        this.name = name;
        this.pageNum = pageNum;
    }

    String getAuthor() { return author;}
    String getName() { return name;}
    int getPage() { return pageNum;}

    String getDescription() { 
        return ("Author: " + author +
                "\nBook name: " + name + 
                "\nAmount pages: " + pageNum);
    }


}
