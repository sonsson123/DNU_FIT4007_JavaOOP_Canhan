import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String ten = scanner.nextLine();

        System.out.println("Do dai ten cua ban la: " + ten.length());
    }
}
