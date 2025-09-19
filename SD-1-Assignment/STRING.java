public class STRING {
    public static void main(String[] args)
    {
        String s = "Skibidi Programmer";
        
        int sLen = s.length();
        
        String upS = s.toUpperCase();
        String lowS = s.toLowerCase();

        int locateS = s.indexOf("Programmer");
        char charS = s.charAt(10);

        int n = 10;
        String concatenateS = n + s;

        System.out.println("Test String is : "+s);
        System.out.println("Test String Length : "+sLen);
        System.out.println("Upper Case : "+upS);
        System.out.println("Lower Case : "+lowS);
        System.out.println("Location of \"Programmer\" is at : "+locateS);
        System.out.println("Character at 10 index is : "+charS);
        System.out.println("String Concatenation : "+concatenateS);
    }
}
