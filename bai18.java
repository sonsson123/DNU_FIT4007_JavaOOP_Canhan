import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh tạo thành tam giác.");
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }
        sc.close();
    }
}
