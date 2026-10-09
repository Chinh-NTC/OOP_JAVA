public abstract class NhanVien {
    private String maNV;
    private String tenNV;
    private int tuoi;
    private String diaChi;
    final int luongCoBan = 3000000;

    // Constructor
    public NhanVien() {}

    public NhanVien(String maNV, String tenNV, int tuoi, String diaChi) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    // Getter, Setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
