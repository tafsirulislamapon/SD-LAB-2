import java.util.Scanner;

public class TooLongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.nextLine();
        if(word.length() > 10)
        {
            String avWord = ""+ word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1) ;
            System.out.println(avWord);
        }
        else{
            System.out.println(word);
        }

        sc.close();
    }   
}