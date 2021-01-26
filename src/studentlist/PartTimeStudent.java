
package studentlist;

/**
 *
 * @author danilandriuschenko
 */
public class PartTimeStudent extends Student {
    private int numCourses;

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    public PartTimeStudent(int numCourses, String name){
        this.numCourses = numCourses;
    }
    
}
