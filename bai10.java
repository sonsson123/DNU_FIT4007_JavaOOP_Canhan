import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap 1 ky tu thuong (a-y): ");
        char ch = scanner.next().charAt(0);

        char nextChar = (char)(ch + 1); // Lấy ký tự tiếp theo
        System.out.println("Ky tu lien sau la: " + nextChar);
    }
}
