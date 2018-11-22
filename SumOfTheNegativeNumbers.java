import java.util.Scanner;
public class SumOfTheNegativeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int sum=0;
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<N;i++){
			if(a[i]<0){
				sum=a[i]+sum;
			}
		}
		System.out.print(sum);
	}

}
