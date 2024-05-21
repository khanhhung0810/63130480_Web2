package khanhhung.duan.duancanhan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="categories")
public class Category {
    @Id
    private int category_id;
    private String category_name;


    // getter and setter methods
    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    
}
