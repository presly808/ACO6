package ua.artcode.static_final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by serhii on 08.02.19.
 */
public class Main {

	public static final int NUMBER = 10;

	public static void main(String[] args) {

		//		Main.NUMBER = 23;

		User u = new User("Oleg");
		User u1 = new User("Ivan");
		User u2 = new User("Andrey");
		User u3 = new User("Kolya");

		//		u3.hello();

		List<User> userList = new ArrayList<>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.remove(u1);



		//		// Object
		//		userList.remove(u1);
		// User extends Object

		//		User.test();

		User[] users = new User[4];
		users[0] = u;
		users[1] = u1;
		users[2] = u2;
		users[3] = u3;

		Object[] m = users;

		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i]);
		}

		System.out.println(Arrays.toString(users));

	}

}

enum UserType {
	// static final
	ADMIN("admin", 0), REGULAR_USER("admin", 0), SUPER_USER("admin", 0);
	//public static final UserType2 ADMIN = new UserType2("admin", 0);

	public final String name;
	public final int number;

	private UserType(String name, int number) {
		this.name = name;
		this.number = number;
	}
}

class UserType2 {

	public static final UserType2 ADMIN = new UserType2("admin", 0);
	public static final UserType2 REGULAR_USER = new UserType2("user", 1);
	public static final UserType2 SUPER_USER = new UserType2("main_user", 2);

	public String name;
	public int number;

	private UserType2(String name, int number) {
		this.name = name;
		this.number = number;
	}

}

class User {

	private static int count;

	private final String name;
	private UserType userType;

	public User(String name) {
		this.name = name;
		count++;
	}

	// depends on object and can access object's fields
	public void hello() {
		System.out.println(this.name);
	}

	public static void test() {
		System.out.println(count);
	}

	@Override public String toString() {
		return "User{" + "name='" + name + '\'' + ", userType=" + userType + '}';
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		User user = (User) o;

		return name != null ? name.equals(user.name) : user.name == null;
	}

	@Override public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}
}
