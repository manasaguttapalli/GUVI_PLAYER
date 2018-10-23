import java.util.Scanner;
public class SanelineorNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 
		    int x1, x2, x3, y1, y2, y3;
		   x1=s.nextInt();
		   y1=s.nextInt();
		   x2=s.nextInt();
		   y2=s.nextInt();
		   x3=s.nextInt();
		   y3=s.nextInt();
		   
		    
		    collinear(x1, y1, x2, y2, x3, y3);
		
	}
	 static void collinear(int x1, int y1, int x2, int y2, 
             int x3, int y3)
{
if ((y3 - y2)*(x2 - x1) == (y2 - y1)*(x3 - x2))
System.out.println("yes");
else
System.out.println("no");
}


}
