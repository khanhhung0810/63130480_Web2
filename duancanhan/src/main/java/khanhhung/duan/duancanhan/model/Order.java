package khanhhung.duan.duancanhan.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Set;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "customer_name")
    private String customerName;

    @OneToMany(mappedBy = "order")
    private Set<OrderDetail> orderDetails;

    public int getOrderId() {
        return orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
