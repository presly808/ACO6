package ua.artcode.test_package;

import java.util.UUID;

/**
 * Created by serhii on 30.01.19.
 */
public class MainController {

	private DB db = new DbJson();

	public String login(String name, String pass){

		User user = db.findUser(name);

		if(user == null) {
			return "No user found";
		}


		if(user.getPass().equals(pass)){

			String accessKey = UUID.randomUUID().toString().substring(0, 8);
			db.addKey(accessKey);

			return accessKey;
		} else {
			return "wrong pass";
		}
	}

}
