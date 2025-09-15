import java.util.Scanner;

public class RatedPrb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char topic = sc.next().charAt(0);

        if(topic == 'A' || topic ==  'B' || topic == 'C')
        {
            System.out.print("yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();
    }    
} 