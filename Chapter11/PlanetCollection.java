
public class PlanetCollection 
{
	// Instance Variable
	private String planetName;
	
	// constructor
	public PlanetCollection(String name)
	{
		setPlanetName(name);
	}
	
	// mutator
	public void setPlanetName(String name)
	{
		this.planetName = name;
	}
	
	// accessor
	public String getPlanetName()
	{
		return this.planetName;
	}
	
	public void print()
	{
		System.out.println(getPlanetName());
	}

}
