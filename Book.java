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
    private int pages;
    private String refNumber;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages= bookPages;
        refNumber="";
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
    public int getPages()
    {
        return pages;
    }
    public void setRefNumber(String ref) 
    {
        refNumber=ref;
    }
    // Printing Method
    public void printDetails()
    {
    System.out.println("Author:"+author);
    System.out.println("Title:"+title);
    System.out.println("Pages:"+pages);
    System.out.println("Reference Number: " + refNumber);
    if (refNumber.length() > 0) {
        System.out.println("Reference Number: " + refNumber);
    } else {
        System.out.println("Reference Number: ZZZ");
    }
}
}
