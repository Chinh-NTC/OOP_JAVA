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
    public double tinhLuong(){
        
    }
}
