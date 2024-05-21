package khanhhung.duan.duancanhan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "products")
public class Product {
    @Id
    @Column(name = "product_id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "hoat_chat")
    private String hoatChat;

    @Column(name = "chi_dinh", columnDefinition = "TEXT")
    private String chiDinh;

    @Column(name = "dang_bao_che")
    private String dangBaoChe;

    @Column(name = "noi_san_xuat")
    private String noiSanXuat;

    @Column(name = "luu_y", columnDefinition = "TEXT")
    private String luuY;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setHoatChat(String hoatChat) {
        this.hoatChat = hoatChat;
    }

    public void setChiDinh(String chiDinh) {
        this.chiDinh = chiDinh;
    }

    public void setDangBaoChe(String dangBaoChe) {
        this.dangBaoChe = dangBaoChe;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    public void setLuuY(String luuY) {
        this.luuY = luuY;
    }

    public Category getCategory() {
        return category;
    }

    public String getHoatChat() {
        return hoatChat;
    }

    public String getChiDinh() {
        return chiDinh;
    }

    public String getDangBaoChe() {
        return dangBaoChe;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public String getLuuY() {
        return luuY;
    }
}
