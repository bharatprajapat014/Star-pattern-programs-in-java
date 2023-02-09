package starpattern;
public class triangle {
    public static void main(String[] args) {
        st6();
    }
    static void st6()
    {
        int i,j;
        int row=5;
        for (i=1; i<row; i++)
        {
            for (j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

