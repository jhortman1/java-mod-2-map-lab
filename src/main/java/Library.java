import java.util.HashMap;

public class Library{

    public HashMap<String,Book> libraryBooks;

    public Library(){
        this.libraryBooks = new HashMap<String,Book>();
    }
    
    public void add(String title, Book book)
    {
        this.libraryBooks.put(title, book);
    }
    public Book getBook(String title)
    {
        return libraryBooks.get(title);
    }
}