import java.util.*;
public class substring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String temp=sc.nextLine();
        for(int i=0;i<temp.length();i++)
        {
            String curr="";
            for(int j=i;j<temp.length();j++)
            {
                curr+=temp.charAt(j);
                System.out.println(curr+"");
            }
            System.out.println();
        }
    }
}