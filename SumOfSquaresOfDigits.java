import java.util.Scanner;
public class SumofSuaresOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int rem,sum=0;
		int n=s.nextInt();
		while(n!=0){
			rem=n%10;
			sum=sum+rem*rem;
			n=n/10;
		}
			System.out.println(sum);
		}

	}
