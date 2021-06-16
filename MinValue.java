import java.util.Scanner;
public class MinValue {
	static int minValue(int a[])
	{
		int minimum =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(minimum>a[i])
			{
				minimum=a[i];
			}
		}
		return minimum;
	}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the Elements in array:");
		for(int i=0;i<=4;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Finding min");
		System.out.println(minValue(arr));
		sc.close();

	}
}
