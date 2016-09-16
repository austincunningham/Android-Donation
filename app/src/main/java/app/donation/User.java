package app.donation;

/**
 * Created by ictskills on 16/09/16.
 */
public class User {
    public String firstName;
    public String secondName;
    public String email;
    public String password;

    public User(String firstName, String secondName, String email, String password){
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.password = password;
    }
}
