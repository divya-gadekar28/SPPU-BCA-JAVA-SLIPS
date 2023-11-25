//Define a class MyNumber having one private integer data member. Write a default constructor 
//initialize it to 0 and another constructor to initialize it to a value. Write methods isNegative, 
//isPositive, isOdd, iseven. Use command line argument to pass a value to the object and perform the above operations. 


import java.util.*;
import java.io.*;

class MyNumber{
    private int n;
    MyNumber(){
        n=0;
    }
    MyNumber(int n){
        this.n=n;
    }
    void isNegative(){
        if(n<0){
            System.out.println("number is negative");
        }
    }
    void isPositive(){
        if(n>0){
            System.out.println("number is positive");
        }
    }
    void isOdd(){
        if(n%2!=0){
            System.out.println("number is odd");
        }
    }
    void isEven(){
        if(n%2==0){
            System.out.println("number is even");
        }
    }
}
public class slip2_q2 {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        MyNumber m=new MyNumber(x);
        m.isPositive();
        m.isNegative();
        m.isOdd();
        m.isEven();
    }
}
