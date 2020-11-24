package stringCalc;
import java.util.Scanner;

public class StringCalculator {
	
	public int Add(String str)
	{
		int sum=0;	
		if(str.length()<1)
			return 0;
		
			for(int l=0;l<str.length();l++)
			{
				if(Character.isDigit(str.charAt(l)))
					sum+=Integer.valueOf(str.charAt(l))-48;
			}				
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String = ");
		String str=s.nextLine();
		
		StringCalculator sc=new StringCalculator ();		
		System.out.println("Sum = "+sc.Add(str));
		s.close();
		
	}

}
