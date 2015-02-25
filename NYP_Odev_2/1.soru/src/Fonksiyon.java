import java.util.Scanner;

public class Fonksiyon
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int x, n;

        System.out.println("f(x, n) = 1 + x / 1! + x^2 / 2! + ... + x^n / n!\n");
        System.out.printf("fonksiyonunu hesaplayabilmek için x ve n değerlerini giriniz.\n\n");

        System.out.printf("x :");
        x = input.nextInt();

        System.out.printf("n :");
        n = input.nextInt();

        double toplam = 0;

        for(int k = 0; k <= n; k++)
        {
            toplam += Math.pow(x, k) / faktoriyel(k);
        }

        System.out.printf("\nf(%d, %d) = %f",x, n, toplam);


    }

    public static int faktoriyel(int sayi)
    {
        if(sayi == 0)
            return 1;

        else
            return sayi * faktoriyel(sayi - 1) ;

    }

}
