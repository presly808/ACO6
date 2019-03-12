package ua.artcode.test_package;

/**
 * Created by serhii on 30.01.19.
 */
public class Test {

	public static void main(String[] args) {
		DbJson dbJson = new DbJson();

		MyList myList = new MyList(); // is-a MyCollection

		FileUtils fileUtils = new FileUtils();

		fileUtils.saveDbIntoFile(dbJson);
		fileUtils.saveDbIntoFile(myList);
	}

}
