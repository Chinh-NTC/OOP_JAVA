import java.util.Scanner;

public class Main{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();

        while (true) {
            System.out.println("--- MENU ---");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. In danh sách nhân viên");
            System.out.print("Lựa chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    qlnv.themNhanVien(sc);
                    break;
                case 2:
                    qlnv.inDanhSachNhanVien();
                    break;
            }
        }
    }
}