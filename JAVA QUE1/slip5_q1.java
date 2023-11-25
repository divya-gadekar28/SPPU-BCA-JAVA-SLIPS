//  Write a program to accept a number from the user, if number is zero then 
// throw user defined exception ―Number is 0, otherwise display factorial of a number

import java.util.*;
class ZeroException extends Exception{}
public class slip5_q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n=sc.nextInt();
        try{         //try block contains the code which may raise error, if occurred it throws by throw keyword
            if(n==0){
                throw new ZeroException();
            }
            else{
                fact(n);
            }
        }
        catch(ZeroException z){        //catch block contains the code thrown by try block and give appropriate actions to that error
            System.out.println("error!! number is 0");
        }
    }

        public static void fact(int n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("factorial of "+n+" is "+fact);

        }
}
