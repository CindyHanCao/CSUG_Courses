/**
 * 
 */
package moduleSix;

import java.util.Comparator;

/**
 * Purpose: create a comparator to compare by rollno
 * @author Cindy Cao 
 */
public class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
    	// compare by student's rollno
        return Integer.compare(s1.rollno, s2.rollno); 
    }
}
