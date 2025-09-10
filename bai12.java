import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap b: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sau khi hoan doi: a = " + a + ", b = " + b);
    }
}
