public class NhanVienKinhDoanh extends NhanVien {
    private double doanhThu;
    private double hoaHong; // Phần trăm hoa hồng nhận được từ doanh thu
    final double phuCap = 2000000;

    // Constructor
    public NhanVienKinhDoanh(String maNV, String tenNV, int tuoi, String diaChi, double doanhThu, double hoaHong) {
        super(maNV, tenNV, tuoi, diaChi);
        this.doanhThu = doanhThu;
        this.hoaHong = hoaHong;
    }
}
