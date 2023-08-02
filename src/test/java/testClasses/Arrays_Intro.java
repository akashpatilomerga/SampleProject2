package testClasses;

public class Arrays_Intro 
{

	public static void main(String[] args)
	{
		
		int a[];
		a= new int [7];
		a[0]=1;
		a[1]=1;
		a[6]=10;
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
