package tests;

import model.User;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*User testUser = new User ("mike","my_passwd", "Mike",
				"Smith", "07771234567");
		System.out.println(testUser.toString());*/
		
	
	//TODO1
	//Setup
	String testUsername = "mike";
	String testPassword = "mike";
	String testFirstName = "mike";
	String testLastName = "mike";
	String testMobileNumber = "mike";
	
	//Exercise
	User testUser = new User(testUsername, testPassword, testFirstName, 
			testLastName, testMobileNumber);
	
	//Verify
	Boolean passed = true;
	if (testUser.getUsername() != testUsername)
	{
		System.out.println("TC1 failed: username did not match");
		passed = false;
	}
	if (testUser.getPassword() != testPassword)
	{
		System.out.println("TC2 failed: pssword did not match");
		passed = false;
	}
	if (testUser.getFirstName() != testFirstName)
	{
		System.out.println("TC3 failed: first name did not match");
		passed = false;
	}
	if (testUser.getLastName() != testLastName)
	{
		System.out.println("TC4 failed: last name did not match");
		passed = false;
	}
	if (testUser.getMobileNumber() != testMobileNumber)
	{
		System.out.println("TC5 failed: mobile number did not match");
		passed = false;
	}
	if (passed)
	{
		System.out.println("All TCs passed.");
	}
}

}
