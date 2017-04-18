package models;

/**
 * Created by Binu Senevirathne on 3/4/2017.
 */
public class UserDetails {


    private  String username;
    private String pass;

    private final String usn = "anne";
    private final String pas = "12345";

    public String getUsn() {
        return usn;
    }

    public String getPas() {
        return pas;
    }

    public UserDetails(){

    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
