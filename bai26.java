import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();
        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        if (a.length() > b.length()) {
            System.out.println("Chuỗi dài hơn: " + a);
        } else if (b.length() > a.length()) {
            System.out.println("Chuỗi dài hơn: " + b);
        } else {
            System.out.println("Hai chuỗi dài bằng nhau, in chuỗi a: " + a);
        }
        sc.close();
    }
}
