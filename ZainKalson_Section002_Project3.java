import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

//This is the effective "main" class, which drives the program
public class ZainKalson_Section002_Project3
{
	public static void main (String[] args)
	{
		
		//These are some of the important variables that will be used throughout the main method
		int numStudents; //This is the number of students in the database
		int selection; //This is used to select which operation the program will perform
		Student database[]; //This is used to declare the database array of object Student
		Student_Employee databaseEmployee[];
		
		//When you add an employee you remove from 1st database and put into second database
		
		int count; //This is a holding value to loop through the database as needed
		
		//This creates a console variable of type Scanner to grab input from the user
		Scanner console = new Scanner(System.in);
		
		System.out.println("\t\t\t" + "Welcome to Student and Course Management System!\n");
		System.out.println("This system will allow you to manage students and courses. Let’s start with the number of students this system will have:");
		//This grabs keyboard input for the number of students in the database
		numStudents = console.nextInt();
		
		int programFork;
		
		do
		{
			System.out.print("Press ‘1’ for Student Management System (SMS)\r\n"
					+ "Press ‘2’ for Course Management System (CMS)\r\n"
					+ "Press ‘0’ to exit\r\n"
					+ "");
			
			programFork = console.nextInt();
			if (programFork == 1)
			{
				//This introduces the program to the user
				System.out.println("\t\t\t" + "Welcome to Student Management System!\n");
				
				//This instantiates the database array and count
				database = new Student[numStudents];
				count = 0;
				
				//This do while loop will run the rest of the program
				do
				{
					//This code shows the forks in the program and allows the user to select which operation they want to perform
					System.out.println("\n***Welcome to Student Management System*** \nPress ‘1’ to add a student\nPress ‘2’ to deactivate a student\nPress ‘3’ to display all students\nPress ‘4’ to search for a student by ID\nPress ‘0’ to exit the system\n");
					selection = console.nextInt();
					
					//This is the first operation, where one can add students up to the number they previously specified would be in the database
					if (selection == 1 && count < numStudents)
					{
						//This requests user input for the initial user information
						System.out.print("Enter first name: ");
						String fName = console.next();
						System.out.print("Enter last name: ");
						String lName = console.next();
						System.out.print("Enter level of the student: ");
						String stuLevel = console.next();
						
						//This creates a new Student object to put into the array
						database[count] = new Student(fName, lName, stuLevel);
						int id = database[count].getID();
						
						//This increments count for looping purposes and confirms the operation that was performed
						count++;
						System.out.println("\n\n" + fName + " " + lName + " has been added as a " + stuLevel + " with ID " + id);
					}
					
					//This is the second operation, where one can deactivate a student
					else if (selection == 2)
					{
						//This requests the student ID and grabs it from the keyboard
						System.out.print("Enter the ID for the student you want to deactivate:");
						int stuID = console.nextInt();
						
						//This creates a loop to search for the student ID
						for (int i = 0; i < count; i++)
						{
							//If the loop comes across the correct array index of the student ID, it will set the status to false, or inactive and let the user know what occurred
							if (database[i].getID() == stuID)
							{
								database[i].setStatus(false);
								System.out.println(database[i].getFName() + database[i].getLName() + " has been deactivated");
							}
						}
					}
					
					//This is the third operation, where one can print out the student database in alphabetical order
					else if (selection == 3)
					{
						File reportCreator = new File("StudentReport.txt");
						FileWriter reportWriter;
						try
						{
							reportWriter = new FileWriter("StudentReport.txt");
							//This creates a new holding String array to temporarily contain the database information
							String students[] = new String[count];
							for (int i = 0; i < count; i++)
							{
								students[i] = (database[i].getFName() + " " + database[i].getLName() + "\nID: " + database[i].getID() + "\nLevel: " + database[i].getLevel() + "\nStatus: " + (database[i].getStatus()? "Active" : "Inactive"));
							}
							
							//Arrays.sort sorts this String array alphabetically
							Arrays.sort(students);
							
							//This loops prints the output of the String array students
							for (int i = 0; i < count; i++)
							{
								reportWriter.write(students[i]);
								System.out.println(students[i]);
								System.out.println();
							}
							
							System.out.println();
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
					
					//This is the fourth operation of the program, where one can find a student by their ID
					else if (selection == 4)
					{
						//This requests the ID and pulls it from the console
						System.out.print("Enter the ID:");
						int stuID = console.nextInt();
						
						//This for loop iterates through the database array
						for (int i = 0; i < count; i++)
						{
							//This determines if the ID of the current array index matches what the user requested and prints out the information for the student if it does
							if (database[i].getID() == stuID)
							{
								System.out.print("\n" + database[i].getFName() + " " + database[i].getLName() + "\nID: " + database[i].getID() + "\nLevel: " + database[i].getLevel() + "\nStatus: " + (database[i].getStatus()? "Active" : "Inactive"));
							}
						}
					}
					
					//This is the fifth operation of the program, where one can assign an on-campus job
					else if (selection == 5)
					{
						//This requests the ID and pulls it from the console
						System.out.print("Enter the student ID:");
						int stuID = console.nextInt();
						
						//This asks for the job to be added
						System.out.println("Enter job:");
						String job = console.nextLine();
						
						//This asks for the type of job to be added
						System.out.println("Enter job type:");
						String jobType = console.nextLine();
						
						//This confirms the operation
						for (int i = 0; i < count; i++)
						{
							//If the loop comes across the correct array index of the student ID, it will set the status to false, or inactive and let the user know what occurred
							if (database[i].getID() == stuID)
							{
								System.out.println(database[i].getFName() + " " + database[i].getLName() + " has been assigned " + ((Student_Employee) database[i]).getJobType() + " " + ((Student_Employee) database[i]).getJob() + "job");
							}
						}
					}
					
					//This is the sixth operation of the program, where one can display all students with on campus jobs
					else if (selection == 6)
					{
						//This requests the ID and pulls it from the console
						System.out.print("Enter the student ID:");
						int stuID = console.nextInt();
						
						//This asks for the job to be added
						System.out.println("Enter job:");
						String job = console.nextLine();
						
						//This asks for the type of job to be added
						System.out.println("Enter job type:");
						String jobType = console.nextLine();
						
						//This confirms the operation
						//This creates a loop to search for the student ID
						for (int i = 0; i < count; i++)
						{
							//If the loop comes across the correct array index of the student ID, it will set the status to false, or inactive and let the user know what occurred
							if (((Student_Employee) database[i]).getJob() != null)
							{
								System.out.println(database[i].getFName() + " " + database[i].getLName() + database[i].getID() + " has been assigned " + ((Student_Employee) database[i]).getJobType() + " " + ((Student_Employee) database[i]).getJob() + "job");
							}
						}
										
					}
					
					//This exits out of the loop per user request
					else if (selection == 0)
					{
						System.out.println("Thanks for using the program!");
						break;
					}
					
					//This exits out of the loop if they did not enter a supported operation
					else
					{
						System.out.println("You entered a number that is not supported. Please enter an integer between 0 and 4!");
						break;
					}
				}
				while (selection != 0);
			}
			else if (programFork == 2) //This is for the CMS
			{
				int selections; //This is for the program subfunctionalities to fork 
				
				do
				{
					System.out.println("\n***Welcome to Course Management System*** \nPress ‘1’ to add a course\nPress ‘2’ to assign a student to a course\nPress ‘3’ to display all students with assigned courses\nPress ‘0’ to exit the system\n");
					selections = console.nextInt();
					if (selections == 1)
					{		
						
						boolean courseContained = false;
						System.out.println("Please enter the course ID");
						String courseID = Integer.toString(console.nextInt());
						System.out.println("Please enter the course Name");
						String courseName = console.nextLine();
						
						File f = new File("Courses.txt");
						//This validate the file does not exist. If it doesn't, it creates a new file
						if (! f.exists())
						{
							try
							{
								f.createNewFile();
							}
							catch (IOException e1)
							{
								e1.printStackTrace();
							}
						}
						//This reads and checks the file
						try
						{
							Scanner input = new Scanner(new File("Courses.txt"));
							
							while (input.hasNextLine())
							{
								if (input.nextLine().contains(courseID))
								{
									System.out.println("Course already exists");
									courseContained = true;
									break;
								}
							}
							
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
						
						if(!courseContained)
						{
							try
							{
								PrintWriter writer = new PrintWriter("Courses.txt");
								
								writer.println(courseID + " " + courseName);
								
								writer.close();
							}
							catch (FileNotFoundException e)
							{
								e.printStackTrace();
							}
						}
						
						
					}
					//This is the second subfunctionality
					if (selections == 2)
					{
						System.out.println("Please enter Student ID:");
						int stuID = console.nextInt();
						System.out.println("Please enter Course ID:");
						int courseID = console.nextInt();
						
						File f = new File("CourseAssignment.txt");
						
						//This validate the file does not exist. If it doesn't, it creates a new file
						if (! f.exists())
						{
							try
							{
								f.createNewFile();
							}
							catch (IOException e1)
							{
								e1.printStackTrace();
							}
						}
						
						//This writes to the file
						try
						{
							PrintWriter writer = new PrintWriter("CourseAssignment.txt");
							
							writer.println(courseID + " " + stuID);
							writer.close();
						}
						catch (FileNotFoundException e)
						{
							e.printStackTrace();
						}
					}
					//This is the third subfunctionaltiy
					if (selections == 3)
					{
						try
						{
							Scanner input = new Scanner(new File("CourseAssignment.txt"));
						
							while (input.hasNextLine())
							{
								System.out.println(input.nextLine());
							}
						}
						catch (FileNotFoundException e)
						{
							e.printStackTrace();
						}
					}
				} while (selections != 0);
				
			}
			else if (programFork == 0)
			{
				System.out.println("Good Bye!!!");
			}
			else
			{
				System.out.println("Invalid input! Good Bye!!!!");
			}
		} while(programFork != 0);
	}
}
