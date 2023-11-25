//. Write a program to accept 3 numbers using command line argument. Sort and display the numbers.


import java.util.*;
import java.io.*;

public class slip20_q1 {
    public static void main(String[] args) {
        int numbers[]=new int[3];
        for(int i=0;i<3;i++){
            numbers[i]=Integer.parseInt(args[i]);
        }
        Arrays.sort(numbers);
        System.out.println("sorted numbers: "+Arrays.toString(numbers));
    }
}
