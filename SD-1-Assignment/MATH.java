public class MATH {
    public static void main(String[] args)
    {
        double a = 3.45;
        double b = 4.321;

        double max = Math.max(a, b);
        double min = Math.min(a, b);
        double exp = Math.pow(a, b);
        double root = Math.sqrt(a);
        System.out.println("Here are the max, min, a^b and root over a respectively : \n"+max+", "+min+", "+exp+", "+root);

    }
}
