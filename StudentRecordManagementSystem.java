package com.elevateLabs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentRecordManagementSystem {
	static ArrayList<Student> studentList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		
		do {
			System.out.println("**** Student Management System ****");
			System.out.println("1. Add student");
			System.out.println("2. Update student");
			System.out.println("3. View student");
			System.out.println("4. Remove student");
			System.out.println("5. Exit ");
			System.out.println("***********************************");
			System.out.print("Enter the choice: ");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				addStudent();
				break;
				
			case 2:
				updateStudent();
				break;
				
			case 3:
				viewStudent();
				break;
				
			case 4:
				removeStudent();
				break;
				
			case 5:
				System.out.println("Exiting the system.....");
				break;
			default:
				System.out.println("Invalid choice..!");
			}
		}while(choice!=5);

	}
	
	public static void addStudent() {
	    System.out.print("Enter the Id of student: ");
	    int id = sc.nextInt();
	    sc.nextLine(); 

	    System.out.print("Enter the name of the student: ");
	    String name = sc.nextLine(); 

	    System.out.print("Enter the total marks of the student: ");
	    double marks = sc.nextDouble();

	    studentList.add(new Student(id, name, marks));
	    System.out.println("Student added successfully!");
	}

	
	public static void updateStudent() {
		System.out.print("Enter the Id to update: ");
		int id = sc.nextInt();
		sc.nextLine();
		for (Student s : studentList) {
			if(s.getId()== id) {
				System.out.print("Enter the new name: ");
				String name = sc.nextLine();
				
				System.out.print("Enter the new marks: ");
				double marks= sc.nextDouble();
				
				s.setName(name);
				s.setMarks(marks);
				System.out.println("Student is updated successfully!");
				return ;
			}
		}
		System.out.println("Student not found.");
	}
	
	public static void viewStudent() {
		
		if(studentList.isEmpty()) {
			System.out.println("No student found.");
		}
		
		System.out.println("Student records: ");
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	public static void removeStudent() {
		System.out.println("Enter the Id of student to delete: ");
		int id = sc.nextInt();
		for (Student student : studentList) {
			if(student.getId()==id) {
				studentList.remove(student);
				System.out.println("Student deleted successfully");
				return ;
			}
		}
		System.out.println("Student not found.");
	}
}
