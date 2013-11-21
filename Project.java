import java.awt.Container;
import java.util.*;

import javax.swing.*;


public class Project {
	public Project() {
		String username = Keyboard.readString();	
		String password = Keyboard.readString();
			if(password.equals("pwd") && username.equals("user")) {//checking against an array of username and passwords
			System.out.println("Correct");
		} else {
		System.out.println("Incorrect");
		}
		input(Keyboard.readString());
	}
	//need another array with full names and age to compare if we get a match
	//login
private List<String> db = Arrays.asList("jas78", "maw77", "jap55", "jae36");
	public void input(String in) {
		for (int i = 0; i < db.size(); i++) {//loop through array
			if (in.equals(db.get(i))) {//string checker
				System.out.println("Hi " + in + " your aber email is: " + in
						+ "@aber.ac.uk");// string constructor
			}
		}
	}

	private static void BuildWindow() {
		JFrame frame = new JFrame("Group A");

		frame.setBounds(20, 20, 100, 100);
		frame.setLayout(null);
		Container content = frame.getContentPane();
		frame.setSize(100, 100);
		frame.pack();
		JTextField txt_User = new JTextField();
		txt_User.setBounds(10, 10, 100, 17);

		frame.add(txt_User);
		frame.setVisible(true);

	}

}
