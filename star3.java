package starpattern;

public class star3 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n)
    {
        int i,j;
        for ( i=1; i<=4; i++)
        {
            for ( j=1; j<=n-i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
