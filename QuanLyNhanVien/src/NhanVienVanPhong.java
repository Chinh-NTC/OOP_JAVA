public class NhanVienVanPhong extends NhanVien {
    private int soGioLam;
    final double luongTheoGio = 30000; // 30000/ 1h

    // Constructor
    public NhanVienVanPhong(String maNV, String tenNV, int tuoi, String diaChi, int soGioLam) {
        super(maNV, tenNV, tuoi, diaChi);
        this.soGioLam = soGioLam;
    }
}
