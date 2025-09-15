import java.util.Scanner;

public class Ratedprb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int candies = sc.nextInt();
        if(candies < N)
        {
            double NeededMore = (double) N - candies;
            double packetsNeeded = Math.ceil(NeededMore / 4.0);
            System.out.println("You need more " + packetsNeeded + " packets of candies.");
        }
        else{
            System.out.println("You have enough candies.");
        }
        sc.close();
    }
}
 