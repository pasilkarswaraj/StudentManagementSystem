package main;


import java.util.Scanner;
import Model.Student;
import Service.StudentService;

public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

     StudentService service =
             new StudentService();

     while(true){

    	 System.out.println("\n========== MENU ==========");

    			 System.out.println("1. Add Student");

    			 System.out.println("2. View Students");

    			 System.out.println("3. Search Student");

    			 System.out.println("4. Delete Student");

    			 System.out.println("5. Update Student");

    			 System.out.println( "6. Exit");

    			 System.out.println("==========================");

         System.out.println("Enter your choice:");

         int choice=sc.nextInt();

         switch(choice){

         case 1:

        	    try{

        	        System.out.println("Enter ID:");

        	        int id=sc.nextInt();

        	        if(service.idExists(id)){

        	            System.out.println("ID already exists");

        	            break;
        	        }

        	        sc.nextLine();

        	        System.out.println("Enter Name:");

        	        String name=sc.nextLine();

        	        System.out.println("Enter Age:");

        	        int age=sc.nextInt();

        	        Student s=new Student(id,name,age);

        	        service.addStudent(s);

        	    }

        	    catch(Exception e){

        	        System.out.println("Invalid input");

        	        sc.nextLine();
        	    }

        	    break;
             case 2:

                 service.viewStudents();

                 break;
                 
             case 3 :
            	 System.out.println("Enter the Student ID : ");
            	 
            	 int searchId = sc.nextInt();
            	 service.searchStudent(searchId);
            	 break;

             case 4 :
            	 System.out.println("Enter the Student ID :");
            	 
            	  int deleteID = sc.nextInt();
            	  service.deleteStudent(deleteID);
            	 break;
            	 
             case 5 :
            	 System.out.println("Enter the Student ID :");
            	 int updateID = sc.nextInt();
            	   sc.nextLine();

            	    System.out.println(
            	    "Enter New Name:");

            	    String newName=sc.nextLine();

            	    System.out.println(
            	    "Enter New Age:");

            	    int newAge=sc.nextInt();

            	    service.updateStudent(updateID,newName,newAge);

            	    break;
             case 6:

                 System.out.println("Program Ended");

                 System.exit(0);

                 
                 break;

             default:

                 System.out.println("Invalid choice");
         }

     }

 }

}
