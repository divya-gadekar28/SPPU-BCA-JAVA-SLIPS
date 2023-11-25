//Write a program to accept a number from user. Check whether number is perfect or not. 
//Use BufferedReader class for accepting input from user.
import java.io.*;
public class slip9_q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number: ");
        int n=Integer.parseInt(b.readLine());
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }
        
    }
}
