import java.util.Scanner;

public class TwoDArray
{

	int[][] arr1 = new int[2][2];
	int[][] arr2 = new int[2][2];
	int[][] arr3 = new int[2][2];

	Scanner sc = new Scanner(System.in);

	public void firstArray()
	{
		System.out.println(" Enter the Value For First Array :");

		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}

	}

	public void secondArray()
	{
		System.out.println(" Enter the value For Second Array :");

		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}

	}

	public void multiplicationOfArray()
	{
		System.out.println("Multiplication of 2D Array ");

		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				arr3[i][j]=arr1[i][j]*arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args)
	{
		TwoDArray tda = new TwoDArray();

		tda.firstArray();
		tda.secondArray();
		tda.multiplicationOfArray();
	}
}
