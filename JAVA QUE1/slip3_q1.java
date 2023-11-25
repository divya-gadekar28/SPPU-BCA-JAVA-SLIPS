// Write a program to accept the 'n' different numbers from user and store it in array. Also print the sum of elements of the array
import java.util.*;

public class slip3_q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("how many elements?");
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];    //array declaration
        for(int i=0;i<n;i++){
            System.out.println("enter number"+(i+1));
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("\nelements of an array are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("\nsum of all array elements is "+sum);
    }
}
