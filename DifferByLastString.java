import java.util.Scanner;
public class DifferByOneChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		int n=str1.length();
		int flag=0;
		if(str1.length()!=str2.length()||str1.equals(str2)){
			flag=1;
		}else{
		for(int i=0;i<str1.length()-1;i++){
		if(str1.charAt(i)==str2.charAt(i)){
			flag=2;
			}
		else{
			System.out.println("no");
			break;
		}
			}
		}		
		if(flag==1){
			System.out.println("no");
		}
		else if(flag==2){
				System.out.println("yes");
		}
	}
}
