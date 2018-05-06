package MyGarbageCollectionSuite;

public class GarbageCollectionExperimentOne 
{

	public static void main(String[] args) 
	{
		// Declare and create new object.
		String junk = new String("Pile of Junk");
		
		// Output to demonstrate that the object has an active reference
		// and is not eligible for garbage collection.
		System.out.println(junk);
		
		// Set the reference variable to null.
		junk = null;
		
		// The String object junk is now eligible for garbage collection.

	}

}
