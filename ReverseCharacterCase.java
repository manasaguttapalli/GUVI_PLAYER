import java.util.Scanner;
public class ReverseCharacterCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(Character.isLowerCase(c)){
				sb.append(Character.toUpperCase(c));
			}
			else{
				sb.append(Character.toLowerCase(c));
			}
		}
		System.out.println(sb);
	}

}
