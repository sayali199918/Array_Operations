import java.io.*;
import java.util.*;

public class Pair_with_sum {

    public static void main(String[] args) {
       int a[] = {5, 2, 6, 8, 1, 9};
//Scanner sc = new Scanner(System.in);
        
        
        int sum = 12;
        int flag =1;
        
        for(int i=0;i<5;i++)
        {
            for(int j =i+1;j<6;j++)
                {
                    if(a[i]+a[j]==sum)
                    {
                        System.out.println("Pair found ("+a[i]+","+a[j]+")");
                        flag = 0;
                    }
                }
        }
                if(flag==1)
                System.out.println("Pair not found");
    }
}