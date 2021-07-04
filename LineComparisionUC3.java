import java.util.Scanner;
import java.lang.Double;

public class LineComparisionUC3 {
	public static void main(String[] args) {
		
		int x1 , y1 , x2 , y2;
		int a1 , b1 , a2 , b2; 
		double length1;
		double length2;
		
		Scanner sc = new Scanner(System.in);
		
		// Coordinates for First Line
		System.out.println("Enter Cordinate x1 :");
		x1 = sc.nextInt();
		System.out.println("Enter Cordinate y1 : ");
		y1 = sc.nextInt();
		System.out.println("Enter Cordinate x2 : ");
		x2 = sc.nextInt();
		System.out.println("Enter Cordinate y2 : ");
		y2 = sc.nextInt();
		
		length1 = Math.sqrt((x2 - x1)*(x2 - x1) + (y2-y1)*(y2-y1));
		
		// Coordinates for Second Line
		System.out.println("Enter Cordinate a1 :");
		a1 = sc.nextInt();
		System.out.println("Enter Cordinate b1 : ");
		b1 = sc.nextInt();
		System.out.println("Enter Cordinate a2 : ");
		a2 = sc.nextInt();
		System.out.println("Enter Cordinate b2 : ");
		b2 = sc.nextInt();
		sc.close();
		
		
		length2 = Math.sqrt((a2 - a1)*(a2 - a1) + (b2-b1)*(b2-b1));
		
		String line1 = Double.toString(length1);
		String line2 = Double.toString(length2);
		
		double comp = line1.compareTo(line2); 	
		
		if (comp == 0)
		{
			System.out.println("Both Lines are EQUAL");
		}
		else if (comp < 0)
		{
			System.out.println("Line1 is SMALLER than Line2 ");
		}
		else
			System.out.println("Line1 is GREATER than Line2");
	}
}
