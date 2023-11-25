// Write a program to accept the user name and greets the user by name. 
// Before displaying the user's name, convert it to upper case letters. 
//For example, if the user's name is Sam, then display greet message as "Hello SAM, nice to meet you!"

import java.util.*;
public class slip4_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String pname=sc.next();
        System.out.println("Hello "+pname.toUpperCase()+", nice to meet you!");
    }
}
