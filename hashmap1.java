/*import java.util.*;
public class hashmap1
{
    public static void main(String[] args)
    {
        Hashmap<Integer,String> student= new HashMap<>();
        student.put(5,"Rohit");
        student.put(10,"Himanshu");
        student.put(15,"Virat Kohli");
        student.put(20,"Cristiano Ronaldo");
        System.out.println(student.get(5));
        System.out.println(student.getOrDefault(15,"Not present"));
        student.remove(15);             
        System.out.println(student.keySet());    
        System.out.println(student.values());                  
    }
}
*/
import java.util.*;
public class hashmap1 
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> student=new HashMap<>();
        student.put(5,"Rohit");
        student.put(10 ,"Jasim");
        student.put(12,"Siddharth");
        student.put(55,"Himanshu");

        System.out.println(student.get(5));
        System.out.println(student.getOrDefault(15,"not present"));
        student.remove(12);  //delete element from hashmap
        System.out.println(student.keySet()); // check all the keys
        System.out.println(student.values());  //check all the values
    }
}