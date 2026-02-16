/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Andrew Wright.)
 * @version (2/16/26 today's date here.)
 */
    public class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    // These two accessors gets the Author name and Title of the Book
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    // Printing Method
    public void printAuthor()
    {
    System.out.println("Author:"+author);    
    }
    public void printTitle()
    {
        System.out.println("Title:"+title);
    }
}
