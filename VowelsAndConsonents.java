import java.util.Scanner;
class VowelsAndConsonents {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		String str=s.nextLine();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				sb.append(str.charAt(i));
			}
			else {
				sb1.append(str.charAt(i));
			}
		}
		System.out.print(sb);
		System.out.print(sb1);
	}

}
