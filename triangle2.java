package starpattern;

public class triangle2 {
    public static void main(String[] args) {
        st7();
    }
    static void st7()
    {
        int i,j;

        for (i=1; i<=5; i++)
        {
            for (j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for (j=1; j<=2*i-1; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
