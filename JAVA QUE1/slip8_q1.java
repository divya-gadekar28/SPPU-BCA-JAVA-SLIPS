//Write a program to reverse a number. Accept number using command line argument. 
//import java.util.*;
import java.io.*;
public class slip8_q1 {
    public static void main(String[] args) throws IOException {
        int n=Integer.parseInt(args[0]);
        int rev=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("reverse of "+temp+" is "+rev);
    }
}
