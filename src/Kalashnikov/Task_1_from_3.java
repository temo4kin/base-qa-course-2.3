import java.util.Scanner;

public class Task_1_from_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        sc.close();

        switch (check)
        {
            case 3:
                System.out.println("�������");
                break;

            case 1:
                System.out.println("�����");
                break;

            case 0:
                System.out.println("��������");
                break;

            default:
                System.out.println("�� ����� �������� ��������");
                break;
        }
    }
}
