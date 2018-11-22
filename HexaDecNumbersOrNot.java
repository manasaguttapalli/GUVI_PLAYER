import java.util.Scanner;
public class HexaDecNumbersOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		String str=s.nextLine();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='A'||str.charAt(i)=='B'||str.charAt(i)=='C'||str.charAt(i)=='D'||str.charAt(i)=='E'||str.charAt(i)=='F'||str.charAt(i)>'0' && str.charAt(i)<='9'){
				count++;
			}
		}
	
		if(count-str.length()==0)
			System.out.println("yes");

		else
			System.out.println("no");
	}

}
