import java.util.*;

//This is the Student class, which defines the Student object
public class Student implements Student_Interface
{
	//These are the private variables. To ensure encapsulation, they are private and can only be accessed indirectly through other methods in this class.
	private String fName;
	private String lName;
	private String stuLevel;
	private int id;
	private boolean status;
	
	//This is the constructor, which assigns values to the private variables based on either default values, random integers, or supplied arguments.
	public Student (String fName, String lName, String stuLevel)
	{
		//Using the "this" keyword allows the program to retrieve the private variable from earlier in the class and set it to the value of the parameter.
		this.fName = fName;
		this.lName = lName;
		if (stuLevel.equals("Freshman") || stuLevel.equals("Sophomore") || stuLevel.equals("Junior") || stuLevel.equals("Senior"))
		{
			this.stuLevel = stuLevel;
		}
		else
		{
			System.out.println("Invalid value. Using default value of freshman"); //CHANGE TO TRY CATCH
			this.stuLevel = "Freshman";
		}

		//The following code sets the status to true and creates a random integer between 0 and 99.
		id = (int) (Math.random() * 100);
		status = true;
	}
	
	//This getter method allows one to indirectly access the otherwise private fName variable
	public String getFName()
	{
		return fName;
	}
	
	//This getter method allows one to indirectly access the otherwise private lName variable
	public String getLName()
	{
		return lName;
	}
	
	//This getter method allows one to indirectly access the otherwise private stuLevel variable
	public String getLevel()
	{
		return stuLevel;
	}
	
	//This getter method allows one to indirectly access the otherwise private id variable
	public int getID()
	{
		return id;
	}
	
	//This getter method allows one to indirectly access the otherwise private status variable
	public boolean getStatus()
	{
		return status;
	}
	
	//This setter method uses a parameter to either activate or deactivate a student
	public void setStatus(boolean status)
	{
		this.status = status;
	}
}
