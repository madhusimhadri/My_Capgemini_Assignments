import java.util.*;
class ResultDeclaration
{
	public String declareResults(double subject1Marks,double subject2Marks,double subject3Marks)
	{
		double sum= subject1Marks+subject2Marks+subject3Marks;
		double sum12=subject1Marks+subject2Marks;
		double sum23=subject2Marks+subject3Marks;
		double sum13=subject1Marks+subject3Marks;
		if((subject1Marks>60) || (subject2Marks>60) ||(subject3Marks>60) ||(sum<60))
		{
			return "failed";
		}
		else if(sum>60)
		{
			if(sum12>60||sum23>60||sum13>60)
			{
				return "passed\n"+"promoted";
			}
			else
			{
				return "passed";
			}
		}
		return " ";
	}
}

public class Assignment1Q4 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double subject1Marks=s.nextDouble();
		double subject2Marks=s.nextDouble();
		double subject3Marks=s.nextDouble();
		
		ResultDeclaration declare=new ResultDeclaration();
		String res= declare.declareResults(subject1Marks, subject2Marks, subject3Marks);
		System.out.println(res + " ");
		s.close();
	}
	

}
