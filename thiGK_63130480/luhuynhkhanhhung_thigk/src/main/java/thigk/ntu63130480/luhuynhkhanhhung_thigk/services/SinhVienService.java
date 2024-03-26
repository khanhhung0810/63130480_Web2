package thigk.ntu63130480.luhuynhkhanhhung_thigk.services;
import thigk.ntu63130480.luhuynhkhanhhung_thigk.models.SinhVien;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {
    private List<SinhVien> danhSachSinhVien = new ArrayList<>();

    // Hàm khởi tạo với hard-code dữ liệu
    public SinhVienService() {
        danhSachSinhVien.add(new SinhVien("SV01", "Nguyễn Văn Trọng", 7.0,"63CNTT-CLC1","Công nghệ thông tin","Trường đại học Nha Trang"));
        danhSachSinhVien.add(new SinhVien("SV02", "Lê Thị Hiền", 8.0,"64CNTT-CLC1","Kế toán","Trường đại học Nha Trang"));
        danhSachSinhVien.add(new SinhVien("SV03", "Võ Đại", 9.0,"62CNTT-CLC1","Công nghệ thực phẩm","Trường đại học Nha Trang"));
       
    }

    // Tìm sinh viên thông qua mã sinh viên
    public SinhVien timKiem(String ma) {
        return danhSachSinhVien.stream()
                .filter(sv -> sv.getMaSoSV().equals(ma))
                .findFirst()
                .orElse(null);
    }

    // Trả về tất cả sinh viên
    public List<SinhVien> layDanhSachSinhVien() {
        return new ArrayList<>(danhSachSinhVien);
    }

    // Thêm mới một sinh viên
    public void themSinhVien(SinhVien sinhVien) {
        danhSachSinhVien.add(sinhVien);
    }
}
