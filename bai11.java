import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap b: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sau khi hoan doi: a = " + a + ", b = " + b);
    }
}
