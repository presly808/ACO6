package ua.artcode.test_package;

import java.util.ArrayList;

/**
 * Created by serhii on 30.01.19.
 */
public class DB {

	// json, xml, exel, sql, file...
	// in memory (in java) internally
	private ArrayList<User> users = new ArrayList<>(); // dynamic size, a lot of methods
	// User[] , read, write, length, fixed sized which is being declared during creation!!!
	private ArrayList<String> accessKeys = new ArrayList<>();


	public User findUser(String name) {
		for (int i = 0; i < users.size(); i++) {
			// == or equals
			if(users.get(i).getName().equals(name)){
				return users.get(i);
			}
		}

		return null;
	}

	public void addKey(String accessKey) {
		accessKeys.add(accessKey);
	}
}
