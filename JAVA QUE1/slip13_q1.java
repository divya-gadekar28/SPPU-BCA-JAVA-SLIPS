//Construct a Linked List having names of Fruits: Apple, Banana, Guava and Orange. Display the contents of the List using an Iterator.

import java.util.*;
public class slip13_q1 {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("guava");
        fruits.add("orange");
        
        System.out.println("Displaying fruit list:");
        Iterator<String> iterator = fruits.iterator();
        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
