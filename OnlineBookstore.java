import java.util.List;
import java.util.ArrayList;

public class OnlineBookstore { 
    private List<Book> books; // stores a collection of books
    private List<User> users; // stores a collection of registered users

    
    public OnlineBookstore () {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
    
    
    //searches the the book's ISBN and checks if the book's ISBN and the ISBN that you're searching are similar
    public Book searchISBN(String ISBN) {
        for(Book bookName : books) {
        if(bookName.getISBN().equals(ISBN)) {
             return bookName;
        } 
    }
     return null; 
    }

    //adds a book to the bookstore
    public void addBook(Book b) {
        books.add(b);
    }

    //removes a book from the bookstore
    public void removeBook(Book b) {
        books.remove(b);
    }
    
    //processes a payment--only handles card payments
    public void processPayment(Payment payment) {
        if(payment instanceof Card) {
            Card card = (Card) payment;
            System.out.println("Card processing: " + card.getCardNum());
        }
    }

    // returns a copy of the collection of books
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    //creates a new user's account if the email is not already registered 
     public boolean createAccount(User user) {
        for (User u : users) {
            if (u.getEmail().equals(user.getEmail())){
                return false;
            } 
        }
        users.add(user);
        return true;
    }


}
