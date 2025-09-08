import java.util.Scanner;
public class KiemTraDiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn học: ");
        double diem = scanner.nextDouble();

        if (diem >= 5) {
            System.out.println("Kết quả: Đỗ");
        } else {
            System.out.println("Kết quả: Trượt");
        }
    }
}
