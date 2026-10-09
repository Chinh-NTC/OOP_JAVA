import java.util.Scanner;

public interface IQuanLyNhanVien {
    void themNhanVien(Scanner sc);
    void inDanhSachNhanVien();
    NhanVien timKiemNhanVien(String maNV);
    void xoaNhanVien(String maNV);
}
