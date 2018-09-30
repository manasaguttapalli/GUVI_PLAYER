import java.util.Scanner;
public class ShiftNTimes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int count=0;
		int a[]=new int[N];
		if(N==1){
			int k=s.nextInt();
			System.out.print(k);
		}
		else if(N==K){
			int[] b=new int[N];
			for(int m=0;m<N;m++){
			 b[m]=s.nextInt();
			}
			for(int i=0;i<N;i++){
				if(i<N-1){
			System.out.print(b[i]+" ");}
				else{
					System.out.println(b[i]);
				}
			}
		}
		else{
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		int z[]=new int [N];
		for(int i=0;i<N;i++){
			if(i+K<N){
				z[i+K]=a[i];
				count++;
			}else{
				for(int j=0;j<=count-1 && count<N;j++){
					z[j]=a[count];
					count++;
				}
			}
			
		}
		for(int i=0;i<N;i++){
			if(i<N-1){
			System.out.print(z[i]+" ");}
			else{
				System.out.print(z[i]);
			}
		}
	}
	}
}
