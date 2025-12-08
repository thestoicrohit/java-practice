import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the subsequence length: ");
        int k = sc.nextInt();
        int n = str.length();
        System.out.println("Subsequences of length " + k + ":");
        for (int i = 0; i < (1 << n); i++)    
        {
            String temp = "";
            for (int j = 0; j < n; j++) 
            {
                if ((i & (1 << j)) != 0) 
                {
                    temp = temp + str.charAt(j);
                }
            }
            if (temp.length() == k) 
            {
                System.out.println(temp);
            }
        }
        sc.close();
    }
}
