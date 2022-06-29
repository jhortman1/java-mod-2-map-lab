public class Book{
    public String title;
    public String genre;
    public int numberOfPages;

    public Book(String title, String genre, int numberOfPages){
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }
    @Override
    public String toString()
    {
        return "Title: " + this.title + " Genre: " + this.genre + " Pages: " + this.numberOfPages;
    }
}