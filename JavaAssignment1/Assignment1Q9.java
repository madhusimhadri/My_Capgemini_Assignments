//import java.util.*;
import java.lang.annotation.*;
class Student
{
	private int subjectA,subjectB,subjectC;
	
	public int studentsTotalMarksInAllSubjects(Student[] students)
	{
		int s1=students[0].subjectA+students[0].subjectB+students[0].subjectC;
		int s2=students[1].subjectA+students[1].subjectB+students[1].subjectC;
		int s3=students[2].subjectA+students[2].subjectB+students[2].subjectC;
		
		return s1+s2+s3;
	}
	public double studentsAverageMarksInAllSubjects(Student[] students)
	{
		int s1=students[0].subjectA+students[0].subjectB+students[0].subjectC;
		int s2=students[1].subjectA+students[1].subjectB+students[1].subjectC;
		int s3=students[2].subjectA+students[2].subjectB+students[2].subjectC;
		
		return (s1+s2+s3)/3; 
	}
	public int[] subjectWiseMarks(Student[] students,String subjectName)
	{
		int subject = subjectA;
    	int[] subMarks =new int[3];
    	if(subjectName.equalsIgnoreCase("subjectA")) {
    		
    		for(int i=0;i<3;i++) {
    			subMarks[i] = students[i].subjectA;
    		}
    	}else if(subjectName.equalsIgnoreCase("subjectB")) {
    		
    		for(int i=0;i<3;i++) {
    			subMarks[i] = students[i].subjectB;
    		}
    	}else {
    		
    		for(int i=0;i<3;i++) {
    			subMarks[i] = students[i].subjectC;
    		}
    	}
    	
		return subMarks;
	}
	
	public int subjectATotalByStudents(int[] marks)
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total +=marks[i];
		}
		return total;
	}
	
	public int subjectBTotalByStudents(int[] marks)
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total +=marks[i];
		}
		return total;
	}
	
	public int subjectCTotalByStudents(int[] marks)
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total +=marks[i];
		}
		return total;
	}
	
	public int subjectTotalByStudents(int[] marks)
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total +=marks[i];
		}
		return total;
		
	}
	
	public double subjectAverageByStudents(int[] marks)
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total +=marks[i];
		}
		return total/3;
		
	}
	
	public double subjectAAverageByStudents(int[] marks)
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total +=marks[i];
		}
		return total/3;
		
	}
	
	public double subjectBAverageByStudents(int[] marks)
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total +=marks[i];
		}
		return total/3;
		
	}
	
	public double subjectCAverageByStudents(int[] marks)
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total +=marks[i];
		}
		return total/3;
		
	}
	
	
	
}

public class Assignment1Q9 
{
	public static void main(String args[])
	{
		//@SuppressWarnings("unchecked")
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
	}
	
	
	
}
