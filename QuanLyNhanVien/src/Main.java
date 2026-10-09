public class Main{
    public static void main() {
        NhanVien nvVP = new NhanVienVanPhong("NV001", "Nguyễn Tấn Chinh", 18, "Đà Nẵng", 500);

        NhanVien nvKD = new NhanVienKinhDoanh("NV002", "Hoàng Văn Tuấn", 19, "Hà Nội", 5000000, 0.2);

        nvVP.inThongTinNhanVien();
        nvKD.inThongTinNhanVien();
    }
}