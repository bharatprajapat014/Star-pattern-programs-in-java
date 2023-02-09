package starpattern;

public class star6 {
    public static void main(String[] args) {
        st6();
    }
    static void st6()
    {
        int i,j;

        for (i=1;i<=5;i++)
        {
            for (j=0;j<=5-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i=2; i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
