import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên N: ");
        int N = sc.nextInt();
        if (N >= 0) {
            System.out.println(N + " là số tự nhiên.");
        } else {
            System.out.println(N + " không phải là số tự nhiên.");
        }
        sc.close();
    }
}
