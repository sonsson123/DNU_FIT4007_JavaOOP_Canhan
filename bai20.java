import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thực: ");
        float a = sc.nextFloat();

        if (a == (int)a) {
            System.out.println(a + " là số nguyên.");
        } else {
            System.out.println(a + " không phải là số nguyên.");
        }
        sc.close();
    }
}
