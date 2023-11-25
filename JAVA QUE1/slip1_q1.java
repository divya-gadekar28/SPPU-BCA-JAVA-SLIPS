// Write a program to accept a number from user and generate multiplication table of a number.

import java.util.Scanner;
public class slip1_q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        System.out.println("Table of "+num);
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
