import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm: ");
        float score = sc.nextFloat();

        if (score >= 0 && score <= 10) {
            System.out.println("Điểm hợp lý.");
        } else {
            System.out.println("Điểm không hợp lý.");
        }
        sc.close();
    }
}
