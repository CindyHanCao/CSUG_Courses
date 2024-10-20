/**
 * 
 */
package moduleSix;

import java.util.Comparator;

/**
 * Purpose: create a comparator to compare by student name
 * @author Cindy Cao 
 */
public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
    	// compare by student name
    	// compareTo() comes from the Comparable interface, which is implemented by the String class and other classes in Java that have natural ordering.
        return s1.name.compareTo(s2.name); 
    }
}
