import java.util.Scanner;
public class ReverseAndRemoveVowels {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String rev="",str1="";
	int n=s.nextInt();
		String str=s.next();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				continue;
			}
			str1=str1+str.charAt(i);
		}
		for(int i=str1.length()-1;i>=0;i--){
			rev=rev+str1.charAt(i);
		}
		System.out.print(rev);
		}
	}
