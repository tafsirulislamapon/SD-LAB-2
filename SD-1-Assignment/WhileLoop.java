import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("You name : ");
        String name = sc.nextLine();
        int i = 0;
        while (i < name.length()) {
            System.out.println((i+1)+". "+name);
            i++;
        }
        sc.close();
    }
}
