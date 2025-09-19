import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("You name : ");
        String name = sc.nextLine();
        for(int i = 0; i < name.length(); i++)
        {
         System.out.println((i+1)+". "+name);
        }
        sc.close();
    }
}
