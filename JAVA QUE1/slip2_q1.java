// Write a program to accept ‘n’ integers from the user & store them in an Array List collection. Display the elements of Array List.

import java.util.*;
public class slip2_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrays = new ArrayList<Integer>();   //arrayList declaration
        System.out.println("how many numbers? ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter number"+(i+1));
            int ele=sc.nextInt();
            arrays.add(ele);
        }
        System.out.println("Elements of Array List are as follows:");
        System.out.println(arrays);
        // Iterator i = arrays.iterator();   //used to loop through collections like arrayList
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

            

    
    }

}
