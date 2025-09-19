public class TypeCast {

    public static void main(String[] args)
    {
        int obtained = 47;
        int total = 60;
        System.out.println("A student obtained "+obtained+" markes out of "+total);

        double avg = (double) obtained/total * 100;

        System.out.printf("His percentage number is : %.2f" , avg);
    }
}


