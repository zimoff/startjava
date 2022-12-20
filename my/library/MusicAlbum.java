package my.library;

class MusicAlbum implements LibraryItem {
    private String author;
    private String name;

    MusicAlbum (String name, String author) {
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

