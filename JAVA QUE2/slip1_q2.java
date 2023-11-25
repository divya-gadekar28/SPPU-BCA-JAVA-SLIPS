//Construct a linked List containing names of colours: red, blue, yellow and orange. Then extend the program to do the following:
//i. Display the contents of the List using an Iterator
//ii. Display the contents of the List in reverse order using a ListIterator
//iii. Create another list containing pink and green. Insert the elements of this list between blue and yellow.

import java.util.*;
import java.io.*;


public class slip1_q2{
    public static void main(String[] args) {
        LinkedList<String> colors=new LinkedList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");
        ListIterator<String> i=colors.listIterator();

        System.out.println("contents of list:-");
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\ncontents of list in reverse order");
        ListIterator<String> ii=colors.listIterator(colors.size());
        while(ii.hasPrevious()){
            System.out.println(ii.previous());
        }

        LinkedList<String> addcolors=new LinkedList<>();
        addcolors.add("pink");
        addcolors.add("green");
        ListIterator<String> iii=addcolors.listIterator();
        while(ii.hasNext()){
            if(ii.next().equals("blue")){
                for (String color : addcolors) {
                    ii.add(color);
                }
                break;
            }
        }
        System.out.println("\nContents of list after insertion:");
        i = colors.listIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}