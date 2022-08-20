import java.util.Scanner;

public class Task_3_from_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (number >= 10 && number < 100)
        {
            int units = number % 10;
            int decimals = number/10;

            if (units == 0)
            {
                System.out.println("Äåëèòü íà íîëü íåëüçÿ!");
            }

            else
            {
                System.out.println(units % decimals);
                System.out.println(decimals % units);
            }
        }

        else
        {
            System.out.println("Âû ââåëè íå äâóçíà÷íîå ÷èñëî!");
        }
    }
}
