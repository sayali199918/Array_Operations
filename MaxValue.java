import java.util.Scanner;
public class MaxValue {
	static int maxValue(int a[])
	{
		int maximum =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(maximum<a[i])
			{
				maximum=a[i];
			}
		}
		return maximum;
	}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the Elements in array:");
		for(int i=0;i<=4;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max = maxValue(arr);
		System.out.println("Finding max");
		System.out.println(max);
		sc.close();

	}

}
