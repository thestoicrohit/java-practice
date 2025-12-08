import java.util.*;

public class unique_string 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = s.split("\\s+");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String w : words) map.put(w, map.getOrDefault(w, 0) + 1);
        for (String w : words) {
            if (map.get(w) == 1) {
                System.out.println(w);
                return;
            }
        }
        System.out.println("No unique word");
    }
}
