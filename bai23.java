import java.util.Scanner;

public class bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " là chữ thường.");
        } else {
            System.out.println(ch + " không phải là chữ thường.");
        }
        sc.close();
    }
}
