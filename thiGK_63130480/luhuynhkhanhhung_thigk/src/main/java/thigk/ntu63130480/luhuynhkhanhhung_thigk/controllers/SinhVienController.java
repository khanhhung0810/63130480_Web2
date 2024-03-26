package thigk.ntu63130480.luhuynhkhanhhung_thigk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import thigk.ntu63130480.luhuynhkhanhhung_thigk.models.SinhVien;
import thigk.ntu63130480.luhuynhkhanhhung_thigk.services.SinhVienService;

@Controller
public class SinhVienController {
 @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/home")
    public String index(Model model) {
        // Lấy thông tin của tất cả sinh viên
        List<SinhVien> sinhVienList = sinhVienService.layDanhSachSinhVien();
        
        // Gửi danh sách sinh viên tới view để hiển thị
        model.addAttribute("sinhVienList", sinhVienList);

        // Trả về view index.html
        return "index";
    }

    
}
