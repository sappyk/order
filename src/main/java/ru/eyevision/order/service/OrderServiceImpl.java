package ru.eyevision.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.eyevision.order.entity.Order;
import ru.eyevision.order.repos.OrderRepo;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}