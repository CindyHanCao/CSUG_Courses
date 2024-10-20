/**
 * 
 */
package moduleSix;

/**
 *Purpose: to test the selectionsort using student objects in ArrayList
 *@author Cindy Cao 
 */
import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
     // Creating an ArrayList of Student objects
     ArrayList<Student> students = new ArrayList<>();
     students.add(new Student(2, "Jeep", "123 J Street"));
     students.add(new Student(1, "Apple", "123 A Street"));
     students.add(new Student(4, "Bee", "123 B Street"));
     students.add(new Student(3, "Cat", "123 C Street"));
     students.add(new Student(6, "Dog", "123 D Street"));
     students.add(new Student(5, "Egg", "123 E Street"));
     students.add(new Student(8, "Fig", "123 F Street"));
     students.add(new Student(7, "Grand", "123 G Street"));
     students.add(new Student(10, "Ham", "123 H Street"));
     students.add(new Student(9, "Lily", "123 L Street"));

     // Sorting by name
     System.out.println("Before sorting by name:");
     printStudents(students);

     SelectionSort.selectionSort(students, new NameComparator());

     System.out.println("\nAfter sorting by name:");
     printStudents(students);

     // Sorting by rollno
     System.out.println("\nBefore sorting by roll number:");
     printStudents(students);

     SelectionSort.selectionSort(students, new RollNoComparator());

     System.out.println("\nAfter sorting by roll number:");
     printStudents(students);
 }

 // Method to print the list of students
 public static void printStudents(ArrayList<Student> students) {
     for (Student student : students) {
         System.out.println(student);
     }
 }
}

