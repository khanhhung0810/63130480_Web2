package thigk.ntu63130480.luhuynhkhanhhung_thigk.models;

public class SinhVien {
    private String maSoSV;
    private String hoVaTen;
    private double diemSo;


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

	public SinhVien(String maSoSV, String hoVaTen, double diemSo) {
		this.maSoSV = maSoSV;
		this.hoVaTen = hoVaTen;
		this.diemSo = diemSo;
	}
}
    