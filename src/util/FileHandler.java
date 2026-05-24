package util;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

import Model.Student;



public class FileHandler {
	public void saveStudents(ArrayList<Student>students) {
		try {

            BufferedWriter bw =new BufferedWriter(new FileWriter("students.txt"));
			
			for(Student s : students) {
				bw.write(s.getID()+","+s.getName()+","+s.getAge());
				bw.newLine();
			}
			bw.close();
			System.out.println("Data Saved Succesfully.");
		}
		catch(IOException e) {
			System.out.println("Error Saving file.");
		}
		
	}
	
	public ArrayList<Student> loadStudents(){

	    ArrayList<Student> students=
	            new ArrayList<>();

	    try{

	        BufferedReader br=new BufferedReader(new FileReader("students.txt"));

	        String line;

	        while((line=br.readLine())!=null){

	            String data[]=line.split(",");

	            int id=Integer.parseInt(data[0]);

	            String name=data[1];

	            int age=Integer.parseInt(data[2]);

	            Student s=new Student(id,name,age);

	            students.add(s);

	        }

	        br.close();

	    }

	    catch(Exception e){

	        System.out.println("Error loading file");
	    }

	    return students;

	}

}
