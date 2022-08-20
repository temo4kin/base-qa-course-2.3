import java.util.Scanner;

public class Task_2_from_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side_of_square = sc.nextInt();
        int radius_of_circle = sc.nextInt();
        sc.close();

        double area_of_square = side_of_square * side_of_square;
        double area_of_circle = (Math.PI) * (radius_of_circle * radius_of_circle);

        if (area_of_square > area_of_circle)
        {
            System.out.println("Площадь квадрата больше площади круга");
        }
        else
        {
            System.out.println("Площадь круга больше площади квадрата");
        }
    }
}
