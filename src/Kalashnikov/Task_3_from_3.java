import java.util.Scanner;

public class Task_3_from_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        int units = number % 10;
        int decimals = number/10;

        System.out.println(units%decimals);
        System.out.println(decimals%units);


    }
}
