//Importing Package Of Scanner Class
import java.util.Scanner;

//Class Name
public class Distance
{
	//getPoint Function to Calculate Distance
	public int getPoint(int x,int y)
        {
                return (int) Math.sqrt(Math.pow((x*x),1)+Math.pow((y*y),1));
        }

	//Main Method
        public static void main(String[] args)
        {
                int x,y;

		//Scanner Class take Input from User
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter The Value Of X :");
                x = sc.nextInt();

                System.out.println("Enter The Value Of Y :");
                y = sc.nextInt();

		//Creating Object of Class
                Distance dis = new Distance();

		//Calling Function
                int distance = dis.getPoint(x,y);

                System.out.println("Distance ="+distance);
        }
}
