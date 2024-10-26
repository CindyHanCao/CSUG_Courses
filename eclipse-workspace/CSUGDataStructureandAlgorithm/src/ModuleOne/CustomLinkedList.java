/**
 * 
 */
package ModuleOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CustomLinkedList {
	/**
	 * @author Cindy Cao
	 * Purpose: create a custom linkedlist
	 */
    private Node head;


 // Method to read integers from a file
    public void readTextFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String expression = scanner.nextLine();
                try {
                	int num = Integer.parseInt(expression.trim()); // Read and parse the integer
                    insert(num); // Insert into linked list
                } catch (IllegalArgumentException e) {
                    System.out.println("Expression: " + expression + " | Error: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
    
    // Method to display the contents of the linked list
    public void display() {
        Iterator<Integer> iterator = iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private class LinkedListIterator implements Iterator<Integer> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int data = current.data;
            current = current.next;
            return data;
        }
    }

    // Insert new node to the last of the linkedlist
    public void insert(int num) {
    	Node newNode = new Node(num);
    	
    	if (head== null) {
    		head = newNode;
    		return;
    	}
    	
    	Node current = head;
    	while (current.next != null) {

    		current = current.next;
    	}
    	current.next = newNode;
    	
    }
    
    public void delete(int num) {
    	if (head != null && head.data == num) {
    		head = head.next;
    		return;
    	}
    	
    	Node current = head;
    	if (current == null) {
    		return;
    	}
    	while (current != null && current.next != null) {
    		//current = current.next;
    		
    		if (current.next.data == num) {
    			current.next = current.next.next;
    		} else {
    			current = current.next;
    		}
    	}
    	
    }
    
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


