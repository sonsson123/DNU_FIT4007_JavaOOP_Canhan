import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N >= 0) {
            int can = (int)Math.sqrt(N);
            if (can * can == N) {
                System.out.println(N + " là số chính phương.");
            } else {
                System.out.println(N + " không phải là số chính phương.");
            }
        } else {
            System.out.println("Vui lòng nhập số nguyên dương.");
        }
        sc.close();
    }
}
