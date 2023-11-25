// Create a Hash table containing Employee name and Salary. Display the details of the hash table. 
import java.util.*;
import java.io.*;
public class slip7_q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hashtable ht=new Hashtable();
        String name;
        double salary;
        int i,n;
        System.out.println("how many employees: ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("enter employee name: ");
            name=sc.next();
            System.out.println("enter employee salary: ");
            salary=sc.nextDouble();
            ht.put(name,salary);
        }
        System.out.println("hash table: "+ht);
        
    }
}
