package khanhhung.duan.duancanhan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Set;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
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

    @Column(name = "anh")
    private String anh;
    
    @OneToMany(mappedBy = "product")
    private Set<OrderDetail> orderDetails;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

}
