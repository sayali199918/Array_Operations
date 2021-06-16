import java.io.*;
import java.util.*;

public class Find_Duplicate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          int a[] = { 5, 6, 8, 2, 4, 6, 9};
        
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int k = sc.nextInt();
        int flag =0;
        
        
        if(k>=a.length)
        {
            for(int i = 0;i<a.length-1;i++)
            {
                for(int j = i+1;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        System.out.println("Duplicates found");
                        flag=1;
                    }
                }
                
            }
        }
        else 
        {
            for(int i = 0;i<a.length;i++)
            {
                for(int j = i+1;j<a.length;j++)
                {
                    if(a[i]==a[j] && j-i == k)
                    {
                        System.out.println("Duplicates found");
                        flag =1;
                    }
                    
                        
                }
            }
            
            
        }
        if(flag==0)
                System.out.println("No duplicates were found");
    }
}