
public class Course implements Course_Interface
{
	private int courseID;
	private String courseName;
	
	public Course (int courseID, String courseName)
	{
		this.courseID = courseID;
		this.courseName = courseName;
	}
	
	public int getCourseID()
	{
		return courseID;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
}
