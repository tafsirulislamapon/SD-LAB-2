import java.util.Scanner;

public class IiucTvPrb {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int totalSubs = (int) Math.ceil(N / 6.0);
        double cost = totalSubs * X;    

        System.out.println("Total Cost : "+cost);
        sc.close();
    }
}
