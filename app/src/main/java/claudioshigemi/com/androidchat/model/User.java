package claudioshigemi.com.androidchat.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by claud on 21/01/2017.
 */


public class User {

    public String username;
    public String firstName;
    public String lasName;


    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String firstName,String lasName) {
        this.username = username;
        this.firstName = firstName;
        this.lasName = lasName;

    }

}
