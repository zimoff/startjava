package my.library;
class Music implements LibraryItem {
    private String author;
    private String name;

    Music (String name, String author) {
        this.author = author;
        this.name = name;
    }

    public String getAuthor() { 
        return author;
    }

    public String getName() {
        return name;
    }

    public String getDescription() { 
        return ("Author: " + author +
                "\nBook name: " + name);
    }


}

