
public class MyBean implements java.io.Serializable 
{
	private int studentId;
	private String studentName;
	
	// no-argument constructor
	public MyBean() 
	{
		
	}
	
	// mutator/setter 
	public void setStudentId(int theID)
	{
		this.studentId = theID;
	}
	
	// accessor/getter
	public int getStudentId()
	{
		return studentId;
	}
	
	// mutator/setter 
	public void setStudentName(String theName)
	{
		this.studentName = theName;
	}
	
	// accessor/getter
	public String getStudentName()
	{
		return studentName;
	}

}
