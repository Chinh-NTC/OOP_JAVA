import java.util.Scanner;

public class Main{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();

        while (true) {
            System.out.println("--- MENU ---");
            System.out.print("Lựa chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());
        }
    }
}