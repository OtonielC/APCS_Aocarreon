
/**
 * Write a description of class StudentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRunner
{
    public StudentRunner(){
        //Calls the properties of the second student
        Student s1 = new Student("Jeff", 4444);
        System.out.print(s1.getName());
        System.out.print(s1.getNum());
        
        //Calls the properties of the second student
        Student s2 = new Student("Bob", 1234);
        System.out.print(s1.getName());
        System.out.print(s1.getNum());
    }
}
