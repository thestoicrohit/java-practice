import java.util.Scanner;

public class duplicate 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for (int j = 0; j < result.length(); j++) 
            {
                if (arr[i] == result.charAt(j)) 
                {
                    count++;
                    break;
                }
            }
            if (count == 0)   
            {
                result += arr[i];
            }
        }
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}

