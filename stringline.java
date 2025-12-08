import java.util.Scanner;

public class CheckString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        line = line.trim();
        if (line.startsWith("java") && line.endsWith("language")) 
        {
            System.out.println("The line starts with 'java' and ends with 'language'.");
        } 
        else 
        {
            System.out.println("The line does not match.");
        }
        sc.close();
    }
}
