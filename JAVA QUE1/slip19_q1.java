//Write a program to accept the 'n' different numbers from user and store it in array. Display maximum number from an array. 

import java.util.*;
import java.io.*;

public class slip19_q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many numbers:");
        int n=sc.nextInt();
        int arrays[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter number"+(i+1)+":");
            arrays[i]=sc.nextInt();
        }
        int max=arrays[0];
        for(int i=0;i<n;i++){
            if(arrays[i]>max){
                max=arrays[i];
            }
        }
        System.out.println("max number is "+max);
    }
    
}
