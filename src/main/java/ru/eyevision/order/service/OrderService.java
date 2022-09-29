package ru.eyevision.order.service;

import ru.eyevision.order.entity.Order;

import java.util.List;

public interface OrderService {

    /**
     * get all orders
     * @return List with all orders
     */
    List<Order> getAllOrders();
}