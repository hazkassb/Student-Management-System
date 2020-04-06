package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter student first name: ");
		this.firstName = scan.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = scan.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's class level: ");
		this.gradeYear = scan.nextInt();
		
		setStudentID();
		
//		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);	
		scan.close();
	}
	
	//Generate an ID
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		}
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner scan = new Scanner(System.in);
			String course = scan.nextLine();
			
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance += costOfCourse;
				
			} else
				break;
			scan.close();
		} while (1 != 0);
		
//		System.out.println("ENROLL IN: " + courses);
//		System.out.println("TUITION BALANCE: " + tuitionBalance);
		
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Yout ballance is: $" +tuitionBalance);
	}
	
	//Pay tuition
	 public void payTuition() {
		 viewBalance();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter your payment amount ($): ");
		 int payment = scan.nextInt();
		 tuitionBalance -= payment;
		 System.out.println("Thank you for your payment of: $" + payment);
		 viewBalance();
		 scan.close();
	 }
	
	//Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
	}

}
