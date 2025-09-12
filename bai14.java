import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int dai = sc.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int rong = sc.nextInt();

        if (dai == rong) {
            System.out.println("Hình chữ nhật là hình vuông.");
        } else {
            System.out.println("Hình chữ nhật không phải là hình vuông.");
        }
        sc.close();
    }
}
