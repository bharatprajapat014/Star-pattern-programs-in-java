package starpattern;
public class diamondpattern {
    public static void main(String[] args) {
        dmnd();
    }
    static void dmnd()
    {
        int i,j,k;
        for (i=1;i<=5;i++)
        {
            for (j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for (k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=4;i>=1;i--)
        {
            for (j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for (k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
