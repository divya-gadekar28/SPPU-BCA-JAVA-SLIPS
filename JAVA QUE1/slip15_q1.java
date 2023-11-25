//Construct a Linked List having names of Fruits: Apple, Banana, Guava and Orange. 
//Display the contents of the List in reverse order using an appropriate interface.

import java.util.*;

public class slip15_q1 {
    public static void main(String[] args) {
        List<String> fruitList= new LinkedList<>();
        fruitList.add("apple");
        fruitList.add("mango");
        fruitList.add("banana");
        fruitList.add("grapes");
        ListIterator i = fruitList.listIterator(fruitList.size());
        while(i.hasPrevious()){
            System.out.println(i.previous()+"\t");
        }

    }
}
