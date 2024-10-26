/**
 * 
 */
package ModuleOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class Main {
	
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        
        // Path to txt file 
        linkedList.readTextFile("/Users/xubowang/eclipse-workspace/CSUGDataStructureandAlgorithm/src/ModuleOne/LinkedListText.txt");

        linkedList.display();
//        // Insert some elements
//        linkedList.insert(1);
//        linkedList.insert(2);
//        linkedList.insert(3);
//
//        // Iterate and display elements
//        Iterator<Integer> iterator = linkedList.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//         System.out.println();
//        
//        linkedList.delete(2);
//
//        Iterator<Integer> iterator2 = linkedList.iterator();
//        while (iterator2.hasNext()) {
//            System.out.print(iterator2.next() + " ");
//        }
        
    }
}
