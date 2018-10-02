import java.util.Scanner;
public class EncodingAString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int res=0;
		for(int i=0;i<str.length();i++){
			int n=(int)str.charAt(i);
			if( n<=87){
			 res=n+3;
			}else{
				res=n-23;
			}
			char c=(char)res;
			System.out.print(c);
		}
	}

}
