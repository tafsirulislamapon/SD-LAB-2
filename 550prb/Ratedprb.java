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
/*
100 page ---> 1 notebook
1----------->1/100
1000pages ---------> 1000/100 notebook = 10 nbs
1kg ------------> 10 notebooks
*/ 