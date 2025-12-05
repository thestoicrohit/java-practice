import java.util.Scanner;

public class nameyearcolour {
    private String name;
    private String favColor;
    private int year;

    public nameyearcolour(String name, String favColor, int year) {
        this.name = name;
        this.favColor = favColor;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Favourite color: " + favColor + ", Year: " + year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your favourite colour: ");
        String color = sc.nextLine();

        System.out.print("Enter year (e.g., 2003): ");
        int year = sc.nextInt();

        UserInfo user = new UserInfo(name, color, year);
        System.out.println("\nSaved info:");
        System.out.println(user);

        sc.close();
    }
}

