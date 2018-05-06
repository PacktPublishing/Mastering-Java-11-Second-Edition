package MyGarbageCollectionSuite;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class GCVerificationTest {

	public static void main(String[] args) throws InterruptedException 
	{
		// Obtain a Runtime instance (to communicate with the JVM)
		Runtime myRuntime = Runtime.getRuntime();

		// Set header information and output initial memory stats
		System.out.println("Garbage Collection Verification Test");
		System.out.println("----------------------------------------------------------");
		System.out.println("Initial JVM Memory: " + myRuntime.totalMemory() + 
				"\tFree Memory: " + myRuntime.freeMemory());
		
		// Use a bunch of memory
		ArrayList<Integer> AccountNumbers = new ArrayList<>(300000);
		for (int i = 0; i < 100000; i++)
		{
			AccountNumbers = new ArrayList<>(3000);
			AccountNumbers = null;
		}
		
		// Provide update with with five passes
		for (int i = 0; i < 3; i++)
		{
			System.out.println("--------------------------------------");
			System.out.println("Free Memory before collection number " + (i+1) + ": " + myRuntime.freeMemory());
			System.gc();
			System.out.println("Free Memory after collection number " + (i+1) + ": " + myRuntime.freeMemory());
			TimeUnit.SECONDS.sleep(1); // delay thread 5 seconds
		}

	}

}
