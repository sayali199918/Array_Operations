import java.util.Scanner;
public class Reversed_Array{
	public static void main(String args[])
	{
		int j=0;
		int arr[]=new int[40];
		int rev[]=new int[40];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter a array Elements: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=size-1;i>=0;i--)
		{
			rev[j] = arr[i];
			j++;
		}
		System.out.println("Reverse Array is :");
		for(int i=0;i<size;i++)
		{
			System.out.println(rev[i]+" ");
		}
		
		
	}
}