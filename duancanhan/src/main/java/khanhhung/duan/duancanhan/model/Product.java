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
    @JoinColumn(name="category_id", nullable=false)
    private Category category;

    @Column(name = "hoat_chat")
    private String hoatChat;

    @Column(name = "chi_dinh")
    private String chiDinh;

    @Column(name = "dang_bao_che")
    private String dangBaoChe;

    @Column(name = "noi_san_xuat")
    private String noiSanXuat;

    @Column(name = "luu_y")
    private String luuY;

    // getters and setters
    //...
}
