package starpattern;

public class star5 {
    public static void main(String[] args) {
        st5();
    }
    static void st5()
    {
        int i,j;
        for (i=1; i<5; i++)
        {
            for (j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //for (i=4; i>=1; i--)
        //{
        //    for (j=1;j<=i-1;j++)
        //    {
         //       System.out.print("* ");
         //   }
          //  System.out.println();
       // }
        for ( i=1; i<=4; i++)
        {
            for ( j=1; j<=4-i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
