public class Book {
    private String title; //book title
    private String author; //the author who wrote the book
    private String ISBN; // the ISBN of the book
    private int publicationYear; //the release year of the book
    private double price;

    public Book(String title, String author, String ISBN, int publicationYear, double price) {
        this.title =  title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    // the price gets set
    public void setPrice(double price) {
        this.price = price;
    }

    //returns the title of the book
    public String getTitle() {
        return title;
    }

    //returns the author's name 
    public String getAuthor() {
        return author;
    }

    //returns the ISBN of the book 
    public String getISBN() {
        return ISBN;
    }

    //returns the publication year of the book
    public int getPublicationYear() {
        return publicationYear;
    }

//returns the price of the book
public double getPrice() {
    return price;
}
    //displays all of the necessary information of the book
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN + 
        "\nPublication year: " + publicationYear + "\nPrice: " + price;
    }

}
