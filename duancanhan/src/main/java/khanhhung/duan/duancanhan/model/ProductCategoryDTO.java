package khanhhung.duan.duancanhan.model;

public class ProductCategoryDTO {
    
    private Integer productId;
    private String name;
    private String categoryName;
    private String hoatChat;
    private String chiDinh;
    private String dangBaoChe;
    private String noiSanXuat;
    private String luuY;
    private String anh;
    private int giaTien;

    public ProductCategoryDTO(Integer productId, String name, String categoryName, String hoatChat, String chiDinh, String dangBaoChe, String noiSanXuat, String luuY, String anh, int giaTien) {
        this.productId = productId;
        this.name = name;
        this.categoryName = categoryName;
        this.hoatChat = hoatChat;
        this.chiDinh = chiDinh;
        this.dangBaoChe = dangBaoChe;
        this.noiSanXuat = noiSanXuat;
        this.luuY = luuY;
        this.anh = anh;
        this.giaTien = giaTien;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getHoatChat() {
        return hoatChat;
    }

    public void setHoatChat(String hoatChat) {
        this.hoatChat = hoatChat;
    }

    public String getChiDinh() {
        return chiDinh;
    }

    public void setChiDinh(String chiDinh) {
        this.chiDinh = chiDinh;
    }

    public String getDangBaoChe() {
        return dangBaoChe;
    }

    public void setDangBaoChe(String dangBaoChe) {
        this.dangBaoChe = dangBaoChe;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    public String getLuuY() {
        return luuY;
    }

    public void setLuuY(String luuY) {
        this.luuY = luuY;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }


}
