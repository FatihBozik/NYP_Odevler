public class Homework1
{
    public static void main(String args[])
    {
        // şekil 1
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 1; j <= 9; j++)
            {
                if( (i == 1) || (i == 9) || (j == 1) || (j == 9) )
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("\n\n");


        // şekil 2
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 1; j <= 9; j++)
            {
                if( ( (i == 9 || i == 1) && j > 3 && j < 7) )
                    System.out.print("*");
                else if( ( (j == 9 || j == 1) && i > 3 && i < 7 ) )
                    System.out.print("*");
                else if( (j != 9 || j != 1) && ( i + j == 4 || j - i ==
                        6) && (i != 1) )
                    System.out.print("*");
                else if( (j != 9 || j != 1) && ( i + j == 16 || i - j == 6) && (i != 9) )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("\n\n");


// şekil 3
        for(int i = 1 ; i <= 9; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                if(i == 3 || j == 3)
                    System.out.print("*");

                else if( (i == 2 && j == 2) || (i == 2) && (j == 4) )
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("\n\n");


        // şekil 4
        for(int i = 1 ; i <= 9; i++)
        {
            for(int j = 1; j <= 9; j++)
            {
                if(i + j == 6 || 8 + i - j == 4)
                    System.out.print("*");
                else if(i - j == 4 || i + j == 14)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}

