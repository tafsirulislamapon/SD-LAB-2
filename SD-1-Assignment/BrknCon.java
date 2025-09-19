public class BrknCon {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++)
        {
            if(i == 3)
            {
                continue;
            }
            else if(i == 4)
            {
                break;
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
