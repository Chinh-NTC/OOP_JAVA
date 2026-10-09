public abstract class NhanVien {
    private String maNV;
    private String tenNV;
    private int tuoi;
    private String diaChi;
    final double luongCoBan = 3000000;

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
        if(maNV == null || maNV.isEmpty()) {
            throw new IllegalArgumentException(
                    "Lỗi. Mã nhân viên không được để trống!"
            );
        }
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        if(tenNV == null || tenNV.isEmpty()) {
            throw new IllegalArgumentException(
                    "Lỗi. Tên nhân viên không được để trống!"
            );
        }
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
