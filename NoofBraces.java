import java.util.Scanner;
public class Noofbraces {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		braces(str);

	}

	private static void braces(String str) {
		int count=0;
		int count1=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				count++;
			}
			else if(str.charAt(i)==')'){
				count1++;
				}
			}
			if(count1==count){
				System.out.println("yes");}
			else{
				System.out.println("no");
			}
		
		
	}

}
