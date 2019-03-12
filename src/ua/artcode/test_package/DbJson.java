package ua.artcode.test_package;

/**
 * Created by serhii on 30.01.19.
 */
// extends and implements mean 'is-a'
public class DbJson extends DB implements MyCollection {

	public String jsonDb = "[ {'id': 23}, {'id' : 21}, {'id': 22} ]";
	public String accessKeyDb = "[ '1234', '23423545', '23423423']";

//	@Override
//	public User findUser(String name) {
//		return null;
//	}

	@Override
	public void addKey(String accessKey) {
		// some logic
	}

	@Override public void add(Object o) {

	}

	@Override public void remove(int position) {

	}

	@Override public int size() {
		return 0;
	}

	@Override public Object get(int position) {
		return null;
	}
}
