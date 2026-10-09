public class NhanVienVanPhong extends NhanVien {
    private int soGioLam;
    final double luongTheoGio = 30000; // 30000/ 1h

    // Constructor
    public NhanVienVanPhong(String maNV, String tenNV, int tuoi, String diaChi, int soGioLam) {
        super(maNV, tenNV, tuoi, diaChi);
        setSoGioLam(soGioLam);
    }


    //Getter/ Setter
    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        if(soGioLam < 0){
            throw new IllegalArgumentException(
                    "Lỗi. Số giờ làm không được âm!"
            );
        }
        this.soGioLam = soGioLam;
    }

    //Kế thừa method inThongTinNhanVien
    @Override
    public void inThongTinNhanVien(){
        System.out.println("---- NHÂN VIÊN VĂN PHÒNG ----");
        super.inThongTinNhanVien();
        System.out.println("Số giờ làm: " + soGioLam);
        System.out.printf("Lương: %.2f\n", tinhLuong());
        System.out.println("-----------------------------");
    }

    @Override
    public double tinhLuong(){
        // Lương nhân viên văn phòng được tính theo công thức: luongCoBan + (soGioLam * luongTheoGio)
        return super.luongCoBan + soGioLam * luongTheoGio;
    }
}
