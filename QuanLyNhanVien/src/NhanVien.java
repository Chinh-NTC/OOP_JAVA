import java.util.HashSet;
import java.util.Set;

public abstract class NhanVien {
    private String maNV;
    private String tenNV;
    private int tuoi;
    private String diaChi;
    final double luongCoBan = 3000000;

    // Constructor
    public NhanVien() {}

    public NhanVien(String maNV, String tenNV, int tuoi, String diaChi) {
        setMaNV(maNV);
        setTenNV(tenNV);
        setDiaChi(diaChi);
        setTuoi(tuoi);
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
        if(tuoi < 18 || tuoi > 50) {
            throw new IllegalArgumentException(
                    "Lỗi. Tuổi nhân viên phải nằm trong khoảng [18 - 50]!"
            );
        }
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        if(diaChi == null || diaChi.isEmpty()) {
            throw new IllegalArgumentException(
                    "Lỗi. Địa chỉ không được để trống!"
            );
        }
        this.diaChi = diaChi;
    }

    // Method inThongTinNhanVien
    public void inThongTinNhanVien(){
        System.out.println("Mã nhân viên: " + maNV);
        System.out.println("Tên nhân viên: " + tenNV);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + maNV +
                "\nTên nhân viên: " + tenNV +
                "\nTuổi: " + tuoi +
                "\nĐịa chỉ: " + diaChi;
    }

    // Method abstract
    public abstract double tinhLuong();
}
