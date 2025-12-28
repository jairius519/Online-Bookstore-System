import java.util.UUID;
public class User {
    private final String userID; //an unique id designed for users that cannot be changed 
   private String name;//the name of the user 
   private final String email; //the email of the user
   private String password; //the password of the user


public User (String name, String email, String password) {
    this.userID = UUID.randomUUID().toString();
    this.name = name;
    this.email = email;
    this.password = password;
}

//sets the name of the user
public void setName(String name) {
    this.name = name;
}

//sets the password of the user
public void setPassword(String password) {
    this.password = password;
}
//returns the user's identification
public String getUserID() {
    return userID;
}

//returns the user's name 
public String getName() {
    return name;
}

//returns the user's email address
public String getEmail() {
    return email;
}

//returns the user's password
public String getPassword() {
    return password;
}

}