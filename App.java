import java.util.*;
import java.lang.Math;

public class App {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first coordinate for a vector in R3: ");
		int x = in.nextInt();
		System.out.print("Input the second coordinate for a vector in R3: ");
		int y = in.nextInt();
		System.out.print("Input the third coordinate for a vector in R3: ");
		int z = in.nextInt();
		// Take the magnitude of the vector
		double mag = (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		System.out.println("The magnitude of the vector is: "+mag);
		System.out.println("The normalized values of the vector are: ");
		System.out.println("<"+x/mag+", "+y/mag+", "+z/mag+">" );
	}
}
