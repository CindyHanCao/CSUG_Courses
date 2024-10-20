/**
 * 
 */
package moduleSix;

/**
 * 
 */
public class Student {
	/**
	 * @param rollno
	 * @param name
	 * @param address
	 * @author Cindy Cao
	 * Purpose: to create a Student object
	 */

	int rollno;
    String name;
    String address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // toString method to print student details
    @Override
    public String toString() {
        return "Student [Roll No=" + rollno + ", Name=" + name + ", Address=" + address + "]";
    }
}
