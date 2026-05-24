package Service;

import java.util.ArrayList;
import util.FileHandler;



import Model.Student;

public class StudentService {
	
	FileHandler file=new FileHandler();

	ArrayList<Student> students=file.loadStudents();
	
	
	public void addStudent(
	        Student student){

	    for(Student s : students){

	        if(s.getID()==student.getID()){

	            System.out.println("Student ID already exists");

	            return;
	        }
	    }

	    students.add(student);

	    file.saveStudents(students);

	    System.out.println("Student Added Successfully");
	}
	
	public boolean idExists(int id){

	    for(Student s : students){

	        if(s.getID()==id){

	            return true;
	        }
	    }

	    return false;
	}
	
	
	public void viewStudents(){

	    if(students.isEmpty()){

	        System.out.println("\nNo students available");

	        return;
	    }

	    System.out.println( "\n===== Student Records =====");

	    for(Student s : students){

	        s.display();
	    }
	}
		
		
		
		public void searchStudent(int id){

		    boolean found = false;

		    for(Student s : students){

		        if(s.getID() == id){

		            s.display();

		            found = true;

		            break;
		        }
		    }

		    if(found == false){

		    	System.out.println("No student found with ID: "+id);
		    }
		}
		
		public void deleteStudent(int id){

		    for(int i=0;i<students.size();i++){

		        if(students.get(i).getID()==id){

		            students.remove(i);

		            file.saveStudents(students);

		            System.out.println("Student removed successfully");

		            return;
		        }
		    }

		    System.out.println("Student not found");
		}
			 
			 
			 public void updateStudent(int id, String newName, int newAge) {
				 for(Student s: students) {
					 if(s.getID()==id) {
						 s.setName(newName);
						 s.setAge(newAge);
						 file.saveStudents(students);
						 System.out.println("Student details updated");
						 return;
					 }
					 
				 }
				 System.out.println("Student not Found");
			 }
		}
	

