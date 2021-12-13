
//Class Name
public class SumOfThree
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		int array[] = {1,0,-1,2,3,-2};
		int n = array.length;

		//Array Length
		System.out.println("Length :"+n);

		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					//Sum of Three Integer Add to ZERO
					if(array[i]+array[j]+array[k] == 0)
					{
						System.out.println(array[i]+" "+array[j]+" "+array[k]); 
					}
				}
			}
		}
	}
}
