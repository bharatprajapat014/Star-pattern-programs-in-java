package starpattern;

public class star2 {
    public static void main(String[] args) {
        starpattern(4);
    }
    static void starpattern(int n)
        {
          for (int row=1; row<=n;row++)
          {
              for (int col=1;col<=row;col++)
              {
                  System.out.print("* ");
              }
              System.out.println();
          }
        }
    }

