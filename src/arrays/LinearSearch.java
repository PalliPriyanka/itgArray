
package arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
       
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of integers");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("enter"+n+"integers");
        for(i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    System.out.println("enter seach element");
    int search=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(array[i]==search){
            System.out.println(search+"is in present array at"+(i+1)+"position");
        break;
    }
    if(i==n)
      System.out.println(search+"is not in given array");
    }
}
}
