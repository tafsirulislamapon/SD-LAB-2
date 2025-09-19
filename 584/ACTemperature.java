import java.util.Scanner;

public class ACTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int minTemp = Math.max(A, C);
        int maxTemp = B;

        if (minTemp <= maxTemp) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

            sc.close();
        }
    }
}
