package stringCalc;
import java.util.Scanner;

public class StringCalculator {
	
	private int count=0;	
	public int GetCalledCount()
	{		
		return count;
	}
	
	public int Add(String str)
	{
		++count;
		int sum=0;	
		if(str.length()<1)
			return 0;
							
			for(int l=0;l<str.length();l++)
			{
				if(Character.isDigit(str.charAt(l)))
				{										
					sum+=Integer.valueOf(str.charAt(l))-48;
				}					
			}				
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String = ");
		String str=s.nextLine();
		
		StringCalculator sc=new StringCalculator ();		
		System.out.println("Sum = "+sc.Add(str));
		System.out.println("Numbers of times Add method was called = "+sc.GetCalledCount());
		s.close();
		
	}

}
