// Define a class MyNumber having one private integer data member. Write a parameterized
// constructor to initialize to a value. Write isEven() to check given number is even or not. Use
// command line argument to pass a value to the object.

import java.util.*;
import java.io.*;


class number{
    private int n;
    number(int n){
        this.n=n;
    }
    boolean isEven(){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
public class slip16_q1 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);    //command line argument
        number num=new number(n);
        if(num.isEven()){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
