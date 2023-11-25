//Write a program which define class Product with data member as id, name and price. Store
//the information of 5 products and Display the name of product having minimum price (Use array of object)

import java.util.*;
import java.io.*;

class product{
    int eid;
    String name;
    float price;

    public void getinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter product id: ");
        eid=sc.nextInt();
        System.out.println("enter product name: ");
        name=sc.next();
        System.out.println("enter product price: ");
        price=sc.nextFloat();
    }
    public void display(){
        System.out.println("product id: "+eid);
        System.out.println("product name: "+name);
        System.out.println("product price: "+price);
    }
};

public class slip4_q2 {
    product p[]=new product[5];
    for(int i=0;i<5;i++){
        p[i]=new product();
        p[i].getinput();
    }
    System.out.println("***Data entered as below***");
    for(int i=0;i<5;i++){
        p[i].display();
        System.out.println("\n");
    }
}
