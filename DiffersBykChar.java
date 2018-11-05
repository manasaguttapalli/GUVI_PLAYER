import java.util.Scanner;
public class DiffersBykChar
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str2=s.next();
		int n=s.nextInt();
		int counter=0;
		char[] s1=str.toCharArray();
		char [] s2=str2.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(!str2.contains(String.valueOf(str.charAt(i)))||!str.contains(String.valueOf(str2.charAt(i))))
				{
					counter++;
				}
		}
		
		if(counter==n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
