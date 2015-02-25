// Ödev 3
// Fatih Bozik
// 1358120003

import java.util.Scanner;
import java.util.Random;

public class TestQuiz
{
    public static void main(String args[])
    {
        MultiplyQuiz test = new MultiplyQuiz(10);
        test.quiz();
    }
}

class MultiplyQuiz
{
    int questionNumber;
    int t = 0, f = 0;
    int successRate = 81;

    MultiplyQuiz(int q)
    {
        questionNumber = q;
    }

    void quiz()
    {
        Scanner input = new Scanner(System.in);
        Random randomNumbers = new Random();

        int guess;

        int num1 = randomNumbers.nextInt(10);
        int num2 = randomNumbers.nextInt(10);

        System.out.printf("How much is %d times %d?\n",num1, num2);
        System.out.printf("Enter your answer (-1 to exit)\n");

        guess = input.nextInt();

        while(guess != -1)
        {
            if( guess != (num1 * num2) )
            {
                System.out.println("No.Please try again.");
                System.out.printf("Enter your answer (-1 to exit)\n");
                f++;
            }


            else
            {
                num1 = randomNumbers.nextInt(10);
                num2 = randomNumbers.nextInt(10);

                System.out.println("Very Good!");
                t++;
                if(t != questionNumber)
                {
                    System.out.printf("How much is %d times %d?\n",num1, num2);
                    System.out.printf("Enter your answer (-1 to exit)\n");
                }
                else
                {
                    successRate = (t * 100)/ (t + f);
                    System.out.println("\n\nSuccess rate is : %" + successRate);

                    if(successRate > 80)
                    {
                        t = f = 0;
                        successRate = 81;

                        System.out.printf("\n\nHow much is %d times %d?\n",num1, num2);
                        System.out.printf("Enter your answer (-1 to exit)\n");

                    }

                    else if(successRate <= 80)
                        break;
                }


            }

            if(successRate > 80)
                guess = input.nextInt();

        }// end of while

    }// end of quiz method

}// end of MultiplyQuiz class


