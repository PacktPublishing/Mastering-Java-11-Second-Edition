import java.util.ArrayList;

public class OldSchool {
	
	private static ArrayList<PlanetCollection> myPlanets = new ArrayList<>();

	public static void main(String[] args) 
	{
		add("Earth");
		add("Jupiter");
		add("Mars");
		add("Venus");
		add("Saturn");
		add("Mercury");
		add("Neptune");
		add("Uranus");
		add("Dagobah");
		add("Kobol");

		for (PlanetCollection orb : myPlanets)
		{
			orb.print();
		}
	
	}
	
	public static void add(String name)
	{
		PlanetCollection newPlanet = new PlanetCollection(name);
		myPlanets.add(newPlanet);
	}

}
