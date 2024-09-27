package gaurav.javacore.lab4.exp3;

abstract class Item {
    private String id;
    private String title;
    private int copies;

    public Item(String id, String title, int copies) {
        this.id = id;
        this.title = title;
        this.copies = copies;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public void checkIn() {
        copies++;
    }

    public void checkOut() {
        if (copies > 0) {
            copies--;
        }
    }

    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + copies;
    }
}

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(String id, String title, int copies, String author) {
        super(id, title, copies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Book extends WrittenItem {
    public Book(String id, String title, int copies, String author) {
        super(id, title, copies, author);
    }
}

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(String id, String title, int copies, String author, int yearPublished) {
        super(id, title, copies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + getAuthor() + ", Year Published: " + yearPublished;
    }
}

abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(String id, String title, int copies, int runtime) {
        super(id, title, copies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }
}

class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(String id, String title, int copies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased;
    }
}

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(String id, String title, int copies, int runtime, String artist, String genre) {
        super(id, title, copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }
}

public class ExerciseThree {
    public static void main(String[] args) {
        Book book = new Book("B001", "Effective Java", 3, "Joshua Bloch");
        JournalPaper journal = new JournalPaper("J001", "Java Programming", 2, "James Gosling", 2020);
        Video video = new Video("V001", "Inception", 5, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd = new CD("C001", "Thriller", 10, 42, "Michael Jackson", "Pop");

        System.out.println(book);
        System.out.println(journal);
        System.out.println(video);
        System.out.println(cd);
    }
}

