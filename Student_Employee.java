
//This is the Student_Employee class, which defines the Student object and extends (inherits) Student
public class Student_Employee extends Student
{
	//These are the private variables. To ensure encapsulation, they are private and can only be accessed indirectly through other methods in this class.
	private String job;
	private String jobType;
	
	//This is the constructor, which assigns values to the private variables based on either default values, super class values, or supplied arguments.
	public Student_Employee(String fName, String lName, String stuLevel, String job, String jobType)
	{
		//This references the variables in the super class, so they do not have to be formally instantiated here
		super(fName, lName, stuLevel);
		
		this.job = job;
		this.jobType = jobType;
		
	}
	
	//This setter method allows one to set the private status variable
	public void setJob(String job)
	{
		this.job = job;
	}
	
	//This setter method allows one to indirectly set the value of the jobType private variable
	public void setJobType(String jobType)
	{
		this.jobType = jobType;
	}

	public String getJob()
	{
		return job;
	}
	
	public String getJobType()
	{
		return jobType;
	}
}
