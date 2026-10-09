public class NhanVienKinhDoanh extends NhanVien {
    private double doanhThu;
    private double hoaHong; // Phần trăm hoa hồng nhận được từ doanh thu
    final double phuCap = 2000000;

    // Constructor
    public NhanVienKinhDoanh(String maNV, String tenNV, int tuoi, String diaChi, double doanhThu, double hoaHong) {
        super(maNV, tenNV, tuoi, diaChi);
        setDoanhThu(doanhThu);
        setHoaHong(hoaHong);
    }

    // Getter/Setter
    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        if(doanhThu < 0){
            throw new IllegalArgumentException(
                    "Lỗi. Doanh thu không được âm!"
            );
        }
        this.doanhThu = doanhThu;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        if(hoaHong <= 0){
            throw new IllegalArgumentException(
                    "Lỗi. Phần trăm hoa hồng không được bé hơn hoặc bằng 0!"
            );
        }
        this.hoaHong = hoaHong;
    }

    @Override
    public void inThongTinNhanVien(){
        System.out.println("---- NHÂN VIÊN KINH DOANH ----");
        super.inThongTinNhanVien();
        System.out.printf("Doanh thu: %.2f\n", doanhThu);
        System.out.println("Phần trăm hoa hồng: " + hoaHong);
        System.out.println("Phụ cấp: " + phuCap);
        System.out.printf("Lương: %.2f\n", tinhLuong());
        System.out.println("-----------------------------");
    }

    @Override
    public double tinhLuong(){
        // Lương nhân viên kinh doanh được tính theo công thức: luongCoBan + (doanhThu * hoaHong) + phuCap
        return super.luongCoBan + phuCap + doanhThu * hoaHong;
    }

    @Override
    public String toString(){
        return super.toString() + "Doanh thu: " + doanhThu +
                "\nHoa hồng: " + hoaHong +
                "\nPhụ cấp: " + phuCap +
                "\nLương: " + tinhLuong();
    }
}
