import java.util.Scanner;
public class GcdofNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(gcd(a,b));

	}

	private static int gcd(int a, int b)
		{
			if(a==0)
			return b;
			if(b==0)
			return a;
			if(a==b)
			return a;
			if(a>b)
				{
					return gcd(a-b,b);
				}
			return gcd(a,b-a);
		
	}

}
