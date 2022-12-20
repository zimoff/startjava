package my.library;

class Book implements LibraryItem  {
    private String author;
    private String name;
    private int pageNum;

    Book(String author, String name, int pageNum) {
        this.author = author;
        this.name = name;
        this.pageNum = pageNum;
    }

    public String getAuthor() { 
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPageNum() { 
        return pageNum;
    }

    public String getDescription() { 
        return ("Author: " + author +
                "\nBook name: " + name + 
                "\nAmount pages: " + pageNum);
    }


}
