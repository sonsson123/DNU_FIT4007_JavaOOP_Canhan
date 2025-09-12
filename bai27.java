import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giờ (0-23): ");
        int h = sc.nextInt();
        System.out.print("Nhập phút (0-59): ");
        int m = sc.nextInt();

        m++; // tăng 1 phút

        if (m == 60) {
            m = 0;
            h++;
            if (h == 24) {
                h = 0;
            }
        }

        System.out.printf("Thời gian sau 1 phút là: %02d:%02d\n", h, m);
        sc.close();
    }
}
