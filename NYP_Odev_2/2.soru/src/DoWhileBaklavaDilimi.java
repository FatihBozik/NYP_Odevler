public class DoWhileBaklavaDilimi
{
    public static void main(String args[])
    {
        int satir = 0;
        int i, j, k, m;

        do
        {
            i = j = k = m = -1;

            if(satir <= 4)
            {

                while(++i < 4 - satir)
                {
                    System.out.print(" ");
                }
                while(++j < 2 * satir + 1)
                {
                    System.out.print("*");
                }


            }
            else
            {

                while(++k < satir - 4)
                {
                    System.out.print(" ");
                }
                while(++m < -2 * satir + 17)
                {
                    System.out.print("*");
                }


            }


            System.out.println();

        }while(satir++ < 9);



    }

}
