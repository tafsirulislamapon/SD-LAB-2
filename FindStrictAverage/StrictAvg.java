import java.util.Scanner;

public class StrictAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a+b)/2.0;
        if(avg>c)
        {
            System.out.println("avg is greater");
        }
        else{
            System.out.println("avg is NOT greater");     
        }

        sc.close();
    }
}