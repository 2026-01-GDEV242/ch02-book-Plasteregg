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
    private int borrowed;
    private final boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages,boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages= bookPages;
        refNumber="";
        borrowed=0;
        courseText=isCourseText;
    }
    // These accessors gets the Author name and Title of the Book,The Pages in the book and the Reference number and how many times a book was borrowed
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
        if (ref != null && ref.length() >= 3)
        {
        refNumber=ref;
    }
        else 
        {
        System.out.println("Error: Reference number must be at least 3 characters long.");
    }
    
    }
    public String getRefNumber()
    {
        return refNumber;
    }
    // this increments the borrow count
    public void borrow()
    {
    borrowed++;
    }
    // this is the accessor for the borrowed field
    public int getBorrowed()
    {
    return borrowed;
    }
    public boolean isCourseText()
    {
    return courseText;
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
    System.out.println("Times Borrowed: " + borrowed);
    System.out.println("Course Text: " + courseText);
}
}
