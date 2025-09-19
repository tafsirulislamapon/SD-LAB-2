import java.util.Scanner;
public class SWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        switch (Case) {
            case 1:
                System.out.println("You choose case 1");
                break;
            case 2:
                System.out.println("You choose case 2");
                break;
            case 3:
                System.out.println("You choose case 3");
                break;
        
            default:
                break;
        }
        sc.close();
    }
}
