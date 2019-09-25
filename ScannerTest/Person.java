
/**
 * Runner for Scanner Test
 *
 * @author (Oats)
 * @version (924)
 */
public class Person
{
    public String fname;
    public String mname;
    public String lname;
    public void parseName(String fullName){
         lname = fullName.substring(0,fullName.indexOf(","));
        fname = fullName.substring(fullName.indexOf(","), fullName.indexOf(" "));
     }

    public Person(String fullName){
        //System.out.println("Your name is " + lname + ", " + fname + " " + mname);
        System.out.println(fname);
        System.out.println(mname);
        System.out.println(lname);

        //if(){
            
        //}
    }
}