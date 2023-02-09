package starpattern;

public class star7 {
    public static void main(String[] args) {
        st();
    }
    static void st()
    {
        int i,j,k,n=5;
        for (i=n; i>=1; i--)
        {
            for (j=n;j>i; j--)
            {
                System.out.print("_");
            }

            for (k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
