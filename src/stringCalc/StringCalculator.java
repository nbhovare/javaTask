package stringCalc;
import java.util.Scanner;

public class StringCalculator {
	
	private static int count=0;
	private static int cntNeg=0;
	
	public int GetCalledCount()
	{		
		return count;
	}
		
	public int doThis(String str,int l)
	{
		while(Character.isDigit(str.charAt(l)) && l<str.length())
		{
			l++;					
			
			if(l>=str.length())
				break;
		}	
		return l;
	}

	public int Add(String str)
	{		
		++count;
		int sum=0,temp;;	
		if(str.length()<1)
			return 0;
		
		for(int l=0;l<str.length();l++)
		{
			if(str.charAt(l)=='-' && l<str.length())
			{
				++l;							
				l=doThis(str,l);		
				++cntNeg;
			}
			
			else if(Character.isDigit(str.charAt(l)))
			{
				if(l>=str.length())
					break;							
				
				if(Character.isDigit(str.charAt(l+1)))
				{
					temp=l;				
					l=doThis(str,l);						
					
					if(!(Integer.valueOf(str.substring(temp, l))>1000))
						sum+=Integer.valueOf(str.substring(temp, l));
					
				}
				else				
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
		System.out.println("Number of Negative Numbers Ignored = "+cntNeg);
		s.close();
		
	}
}
