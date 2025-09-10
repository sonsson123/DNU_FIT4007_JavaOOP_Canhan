import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so nguyen b (khac 0): ");
        int b = scanner.nextInt();

        System.out.println(a + " / " + b + " = " + ((double) a / b));
    }
}
