package com.jspiders.p1;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainClass 
{
	public static void main(String[] args)
	{
		Student st1=new Student(123,"Bheem",68.67);
		Student st2=new Student(342,"Chutki",98.67);
	    Student st3=new Student(232,"Kalia",56.67);
	    Student st4=new Student(111,"Dolu",60.67);
	    Student st5=new Student(343,"Bolu",61.67);
	    
	    ArrayList<Student> stList=new ArrayList<Student>();
	    
	    stList.add(st1);
	    stList.add(st2);
	    stList.add(st3);
	    stList.add(st4);
	    stList.add(st5);
	    //stList.add(6,st5);
	    
	    System.out.println("Total number of students:"+stList.size());
	    System.out.println(stList);
	    
	    System.out.println("Student List");
	    System.out.println("-----------------------------------------");
	    System.out.println("RollNo\tName\tMarks");
	    System.out.println("-----------------------------------------");
	    for(Student st:stList) 
	    {
	    	System.out.println(st.getRollno()+"\t"+st.getName()+"\t"+st.getMarks());
	    }
	    System.out.println();
	    
	    System.out.println("Updated Bheem's Marks?");
	    stList.get(0).setMarks(80.91);
	    
	    System.out.println("Updating Kalia's rollno");
	    //Updating via for each loop incase of not aware about the index value
	    for(Student st:stList) 
	    {
	    	if(st.getName().equalsIgnoreCase("kalia")) {
	    		st.setRollno(100);
	    	}
	    }
	    
	    System.out.println("Student List");
	    System.out.println("-----------------------------------------");
	    System.out.println("RollNo\tName\tMarks");
	    System.out.println("-----------------------------------------");
	    //Normal for loop works only for list whereas for queue and set it wont work as it is not indexed base
	    for(int i=0;i<stList.size();i++) 
	    {
	    	Student st=stList.get(i);
	    	System.out.println(st.getRollno()+"\t"+st.getName()+"\t"+st.getMarks());
	    }
	    
	    System.out.println();
	    
	    //Iterator Interface for iterating values.
	    ListIterator<Student> iterator = stList.listIterator();
	    while(iterator.hasNext())
	    {
	    	Student st = iterator.next();
	    	System.out.println(st);
	    }
	}
}
