import java.awt.Container;
import java.util.*;
import javax.swing.*;

public class Project {
    private String[] passwords = new String[]{"apples","bananas","pinapples","pears"};
    private List<String> db = Arrays.asList("jas78", "maw77", "jap55", "jae36");

    
    public Project() {
        System.out.print("Username: ");
        String username = Keyboard.readString();
        System.out.print("Password: ");
        String password = Keyboard.readString();// reads the inputted password and attempts to match it
        //to any of the existing passwords

        input(username, password);
    }
    //need another array with full names and age to compare if we get a match
    //login
    public void input(String in, String pwd) {
        if(checkLogin(in, pwd)) {// checks the inputted password and user name
            System.out.println("Hi " + in + " your aber email is: " + in
                + "@aber.ac.uk");
        } else {
            System.out.print("Please re-enter your password");// ch
        }
    }

    private boolean checkLogin(String in, String pwd) {
        for (int i = 0; i < db.size(); i++) {// provides a loop to go through both arrays, which should both be
            //the same length as they match eachother.
            if (in.equals(db.get(i)) && pwd.equals(passwords[i])) {// checks wheather the username at position i,
                //matches the users input, and does the same for the password, so each user has a unique password.
                // string constructor
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

}
