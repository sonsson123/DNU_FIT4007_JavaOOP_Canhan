import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " là chữ in hoa.");
        } else {
            System.out.println(ch + " không phải là chữ in hoa.");
        }
        sc.close();
    }
}
