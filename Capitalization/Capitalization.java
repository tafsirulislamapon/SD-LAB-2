import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String capWord = "" + Character.toUpperCase(word.charAt(0)) + word.substring(1);
        System.out.println(capWord);
        sc.close();
    }
}
