public class DataType {
    public static void main(String[] args)
    {
        int id = 123;
        double price = 4199.99;
        String pName = "Keyboard";
        char currency = '$';
        boolean inStock = false;

        System.out.println("Product id : " + id );
        System.out.println("Product name : "+pName);
        System.out.println("Price : "+price+currency);
        System.out.println(inStock ? "Available" : "Not in Stock");
    }
}
