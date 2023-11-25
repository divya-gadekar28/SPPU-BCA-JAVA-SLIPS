// Accept 'n' integers from the user and store them in a collection. Display 
// them in the sorted order. The collection should not accept duplicate elements(Use a suitable collection). 
// Search for a particular element using predefined search method in the Collection framework. 

import java.util.*;
public class slip6_q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TreeSet<Integer> numbers= new TreeSet<Integer>();   
        System.out.println("how many numbers?:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter number"+(i+1));
            int ele=sc.nextInt();
            numbers.add(ele);
        }
        System.out.println("numbers you written are "+numbers);
        System.out.println("enter a element to be searched");
        int search=sc.nextInt();
        if(numbers.contains(search)){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
    }
}
