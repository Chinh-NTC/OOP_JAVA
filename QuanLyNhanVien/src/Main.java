import java.util.Scanner;

public class Main{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();

        while (true) {
            System.out.println("--- MENU ---");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. In danh sách nhân viên");
            System.out.println("3. Tìm kiếm nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    qlnv.themNhanVien(sc);
                    break;
                case 2:
                    qlnv.inDanhSachNhanVien();
                    break;
                case 3:
                    System.out.print("Nhập mã nhân viên muốn tìm: ");
                    String maNV = sc.nextLine();
                    NhanVien nvTim = qlnv.timKiemNhanVien(maNV);
                    if(nvTim == null){
                        System.out.println("Không tìm thấy nhân viên có mã: " + maNV);
                    }
                    else{
                        nvTim.inThongTinNhanVien();
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã nhân viên muốn xóa: ");
                    String maNV_xoa = sc.nextLine();
                    qlnv.xoaNhanVien(maNV_xoa);
                    break;
                case 0:
                    System.out.println("-> Đã thoát khỏi chương trình!");
                    return;
                default:
                    System.out.println("Lỗi. Vui lòng chọn đúng chức năng!");
            }
        }
    }
}