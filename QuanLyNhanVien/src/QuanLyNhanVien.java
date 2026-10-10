import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuanLyNhanVien implements IQuanLyNhanVien{
    private Map<String, NhanVien> dsNV;

    // Constructor
    public QuanLyNhanVien() {
        dsNV = new HashMap<>();
    }

    // Method thêm nhân viên
    @Override
    public void themNhanVien(Scanner sc){
        try {
            while(true){
                System.out.println("--- DANH MỤC NHÂN VIÊN ----");
                System.out.println("1. Nhân viên văn phòng");
                System.out.println("2. Nhân viên kinh doanh");
                System.out.print("Lựa chọn loại nhân viên muốn thêm: ");
                int choice = Integer.parseInt(sc.nextLine());

                if(choice == 1){
                    System.out.println("--- Thêm nhân viên văn phòng ---");
                    System.out.print("Mã nhân viên: ");
                    String maNV = sc.nextLine();

                    System.out.print("Tên nhân viên: ");
                    String tenNV = sc.nextLine();

                    System.out.print("Tuổi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());

                    System.out.print("Địa chỉ: ");
                    String diaChi = sc.nextLine();

                    System.out.print("Số giờ làm: ");
                    int soGioLam = Integer.parseInt(sc.nextLine());

                    // Khởi tạo nhân viên mới
                    NhanVien nvVP = new NhanVienVanPhong(maNV, tenNV, tuoi, diaChi, soGioLam);
                    // Thêm vào danh sách
                    dsNV.put(maNV, nvVP);
                    System.out.println("-> Đã thêm thành công nhân viên mã: " + maNV);
                    break;
                }
                else if(choice == 2){
                    System.out.println("---- Thêm nhân viên kinh doann ----");
                    System.out.print("Mã nhân viên: ");
                    String maNV = sc.nextLine();

                    System.out.print("Tên nhân viên: ");
                    String tenNV = sc.nextLine();

                    System.out.print("Tuổi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());

                    System.out.print("Địa chỉ: ");
                    String diaChi = sc.nextLine();

                    System.out.print("Doanh thu: ");
                    double doanhThu = Double.parseDouble(sc.nextLine());

                    System.out.print("Phần trăm hoa hồng (%): ");
                    double hoaHong = Double.parseDouble(sc.nextLine());

                    // Khởi tạo nhân viên mới
                    NhanVien nvKD = new NhanVienKinhDoanh(maNV, tenNV, tuoi, diaChi, doanhThu, hoaHong);
                    // Thêm nhân viên vào danh sách
                    dsNV.put(maNV, nvKD);
                    System.out.println("-> Đã thêm thành công nhân viên mã: " + maNV);
                    break;
                }
                else {
                    System.out.println("Lỗi. Vui lòng chọn lại!");
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Method in danh sách nhân viên
    @Override
    public void inDanhSachNhanVien(){
        System.out.println("--- DANH SÁCH NHÂN VIÊN ---");
        for(Map.Entry<String, NhanVien> entry : dsNV.entrySet()){
            entry.getValue().inThongTinNhanVien();
        }
    }

    @Override
    public NhanVien timKiemNhanVien(String maNV){
        for(Map.Entry<String, NhanVien> entry : dsNV.entrySet()){
            if(entry.getKey().equals(maNV)){
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void xoaNhanVien(String maNV){
        if(dsNV == null || dsNV.isEmpty()){
            System.out.println("Danh sách rỗng!");
            return;
        }
        if(timKiemNhanVien(maNV) != null){
            dsNV.remove(timKiemNhanVien(maNV));
            System.out.println("Đã xóa thanh công nhân viên mã: " + maNV);
        }
        else {
            System.out.println("Không tìm thấy nhân viên mã: " + maNV);
        }
    }
}
