import java.util.Scanner;
public class CatalanNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<=N-1;i++){
		System.out.print(res(i)+" ");
		}
		
		System.out.print(res(N));

	}

	private static int res(int n) {
		int result=0;
		if(n<=1)
			return 1;
		for(int i=0;i<n;i++){
			result+=res(i)*res(n-i-1);
		}
			
		return result;
		
	}

}
