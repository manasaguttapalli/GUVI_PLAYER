import java.util.Scanner;
public class NoOfPrimesbetween {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		int l=s.nextInt();
		int n=s.nextInt();
			for(int i=l+1;i<n;i++){
				boolean prime=true;
				for(int j=2;j<i;j++){
					if(i%j==0){
						prime=false;
						break;
					}
				}
				if(prime){
					count++;
			}

			}
			System.out.println(count);
		}

	}
