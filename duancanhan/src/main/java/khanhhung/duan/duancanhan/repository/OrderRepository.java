package khanhhung.duan.duancanhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import khanhhung.duan.duancanhan.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
