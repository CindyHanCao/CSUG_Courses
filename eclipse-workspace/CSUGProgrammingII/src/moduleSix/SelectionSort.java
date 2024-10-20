/**
 * 
 */
package moduleSix;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Purpose: to create selection sort using ArrayList
 * @author Cindy Cao 
 */
public class SelectionSort {
    public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
        int n = students.size();
        
        // iterate through student object
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
            	// use comparator passed in to compare two adjacent student object
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            Student temp = students.get(minIndex);
            students.set(minIndex, students.get(i));
            students.set(i, temp);
        }
    }
}
