package khanhhung.duan.duancanhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import khanhhung.duan.duancanhan.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
