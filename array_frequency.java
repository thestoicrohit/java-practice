import java.util.*;
public class array_frequency
{
    public static void main(String[] args)
    {
        int [] arr={1,2,1,3,4,5,1,2,3,4,5,4,2,3,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key: map.keySet())
        {
            System.out.println(key+"-->"+map.get(key));
        }
    }
}