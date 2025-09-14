import java.util.Scanner;

public class Assprb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x+3 <= 10)
        {
            System.out.println("Can make it");
        }
        else{
            System.out.println("CAN'T make it");
        }
        sc.close();
    }
}
/*
submit = 3
before 10PM
start at X pm!
1 ass take 1h
*/ 