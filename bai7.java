import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen N (co it nhat 2 chu so): ");
        int n = scanner.nextInt();
        n = Math.abs(n);  // Lấy trị tuyệt đối nếu n < 0

        int ganCuoi = (n / 10) % 10; // Bỏ chữ số cuối rồi lấy số mới cuối
        System.out.println("Chu so gan cuoi cua N la: " + ganCuoi);
    }
}
