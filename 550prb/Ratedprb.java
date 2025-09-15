import java.util.Scanner;

public class Ratedprb {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        int totalNb = (int)(N * 10);
        System.out.println("total note books" + totalNb);
       
        sc.close();
    }
}
