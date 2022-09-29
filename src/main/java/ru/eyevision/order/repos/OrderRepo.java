package ru.eyevision.order.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eyevision.order.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}