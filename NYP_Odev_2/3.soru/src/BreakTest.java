public class BreakTest
{
    public static void main(String args[])
    {
        int count;
        boolean variable = true;

        for(count = 1; count <= 10 && variable; count++)
        {
            if(count == 4)
                variable = false;

            System.out.printf("%d ",count);
        }

        System.out.printf("\nBroke out of loop at count = %d\n",count);
    }

}
