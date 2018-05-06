package MyGarbageCollectionSuite;

public class GarbageCollectionExperimentTwo 
{

	public static void main(String[] args)
	{
		// Declare and create the first object.
		String junk1 = new String("The first pile of Junk");

		// Declare and create the second object.
		String junk2 = new String("The second pile of Junk");

		// Output to demonstrate that both objects have active references
		// and are not eligible for garbage collection.
		System.out.println(junk1);
		System.out.println(junk2);

		// Set the first object's reference to the second object.
		junk1 = junk2;

		// The String "The first pile of Junk" is now eligible for garbage collection.

	}

}
