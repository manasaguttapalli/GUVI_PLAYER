import java.util.Scanner;
public class Evenfactors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=1;i<N-1;i++){
			if(N%i==0){
				if(i%2==0){
					System.out.print(i+" ");
				}
			}
		}
		System.out.print(N);

	}

}
