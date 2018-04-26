/*
 * This is a simple password generation app
 */
import java.util.Scanner;

public class GeneratePassword 
{

	public static void main(String[] args)
	{
		// passwordLength int set up to easily change the schema
		int passwordLength = 8; //default value

		Scanner in = new Scanner(System.in);
		System.out.println("How long would you like your password (min 8)?");
		int desiredLength;
		desiredLength = in.nextInt();
		
		// Test user input
		if (desiredLength >8)
		{
			passwordLength = desiredLength;
		}
		
		// Generate new password
		String newPassword = createNewPassword(passwordLength);
		
		// Prepare and provide output
		String output = "\nYour new " + passwordLength + "-character password is: ";
		System.out.println(output + newPassword);
	}

	public static String createNewPassword(int lengthOfPassword)
	{
		// Start with an empty String
		String newPassword = "";

		// Populate password 
		for (int i = 0; i < lengthOfPassword; i++)
		{
			newPassword = newPassword + randomizeFromSet("aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ0123456789+-*/?!@#$%&");
		}
		return newPassword;
	}

	public static String randomizeFromSet(String characterSet)
	{
		int len = characterSet.length();
		int ran = (int)(len * Math.random());
		return characterSet.substring(ran, ran + 1);
	}

}
