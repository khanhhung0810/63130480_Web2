package thigk.ntu63130480.luhuynhkhanhhung_thigk.models;

public class SinhVien {
    private String maSoSV;
    private String hoVaTen;
    private double diemSo;
    private String lop;
    private String khoa;
    private String truong;

    public SinhVien() {
        
    }

    public String getMaSoSV() {
		return maSoSV;
	}
	public void setMaSoSV(String maSoSV) {
		this.maSoSV = maSoSV;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
    
	public double getDiemSo() {
		return diemSo;
	}
	public void setDiemSo(double diemSo) {
		this.diemSo = diemSo;
	}

    public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}

    public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

    public String getTruong() {
		return truong;
	}
	public void setTruong(String truong) {
		this.truong = truong;
	}

	public SinhVien(String maSoSV, String hoVaTen, double diemSo, String lop, String khoa, String truong) {
		this.maSoSV = maSoSV;
		this.hoVaTen = hoVaTen;
		this.diemSo = diemSo;
		this.lop = lop;
		this.khoa = khoa;
		this.truong = truong;
	}
}
