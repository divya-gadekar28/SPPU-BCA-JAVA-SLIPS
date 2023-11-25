//Write a program to print the factors of a number. Accept a number using command line argument.

import java.util.*;
import java.io.*;

public class slip18_q1 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        System.out.println("factors of "+n+" are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
