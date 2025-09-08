import java.util.Scanner;

public class NgayTrongTuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số từ 1-7 (1 = Thứ 2, 7 = Chủ nhật): ");
        int day = sc.nextInt();

        switch(day) {
            case 1: System.out.println("Thứ Hai"); break;
            case 2: System.out.println("Thứ Ba"); break;
            case 3: System.out.println("Thứ Tư"); break;
            case 4: System.out.println("Thứ Năm"); break;
            case 5: System.out.println("Thứ Sáu"); break;
            case 6: System.out.println("Thứ Bảy"); break;
            case 7: System.out.println("Chủ Nhật"); break;
            default: System.out.println("Số không hợp lệ!");
        }
    }
}
