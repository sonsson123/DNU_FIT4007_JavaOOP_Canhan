import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen N: ");
        int n = scanner.nextInt();

        int lastDigit = Math.abs(n % 10);

        System.out.println("Chu so cuoi cung: " + lastDigit);
    }
}
