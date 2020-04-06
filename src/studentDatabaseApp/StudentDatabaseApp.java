package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {	
		//Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner scan = new Scanner(System.in);
		int numOfStudents = scan.nextInt();
		Student[] students	 = new Student[numOfStudents];
		
		//Create n number of new students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
//			Student stud = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
		}

	}

}
