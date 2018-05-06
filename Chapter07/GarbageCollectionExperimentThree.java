package MyGarbageCollectionSuite;

public class GarbageCollectionExperimentThree 
{
	// instance variable
	GarbageCollectionExperimentThree objectNbr;
	
	public static void main(String[] args) 
	{
		GarbageCollectionExperimentThree objectNbr2 = new GarbageCollectionExperimentThree();
		GarbageCollectionExperimentThree objectNbr3 = new GarbageCollectionExperimentThree();
		GarbageCollectionExperimentThree objectNbr4 = new GarbageCollectionExperimentThree();
		GarbageCollectionExperimentThree objectNbr5 = new GarbageCollectionExperimentThree();
		GarbageCollectionExperimentThree objectNbr6 = new GarbageCollectionExperimentThree();
		GarbageCollectionExperimentThree objectNbr7 = new GarbageCollectionExperimentThree();
		
		// set objectNbr2 to refer to objectNbr3
		objectNbr2.objectNbr = objectNbr3;
		
		// set objectNbr3 to refer to objectNbr4
		objectNbr3.objectNbr = objectNbr4;
				
		// set objectNbr4 to refer to objectNbr5
		objectNbr4.objectNbr = objectNbr5;
				
		// set objectNbr5 to refer to objectNbr2
		objectNbr5.objectNbr = objectNbr2;
				
		// set selected references to null
		objectNbr2 = null;
		objectNbr3 = null;
		objectNbr4 = null;
		objectNbr5 = null;

	}

}
