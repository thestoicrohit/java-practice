/*import java.util.*;
public static panagram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int [] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
            {
                System.out.println("Not a panagram");
                return;
            }
        }
        System.out.println("Panagram");
    }
}
    */

import java.util.*;

public class panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') 
            {      
                arr[ch - 'a']++;
            }
        }
        for (int count : arr) {
            if (count == 0) {
                System.out.println("Not panagram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}
