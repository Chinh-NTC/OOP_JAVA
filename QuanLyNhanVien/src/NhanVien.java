public abstract class NhanVien {
    private String maNV;
    private String tenNV;
    private int tuoi;
    private String diaChi;
    final int luongCoBan = 3000000;

    public NhanVien(String maNV, String tenNV, int tuoi, String diaChi) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

}
