//Importing Package of Scanner Class
import java.util.Scanner;

//Class Name
public class WindChill
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		int t,v;

		//Scanner Class to take Input from User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Value Of T :");
		t = sc.nextInt();

		System.out.println("Enter The Value Of V :");
		v = sc.nextInt();

		//Formula to get Wind Chill Temperature
		double weather = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16));

		System.out.println("Wind Chill Temperature :"+weather);
	}
}
