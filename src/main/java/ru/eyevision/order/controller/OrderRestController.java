package ru.eyevision.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.eyevision.order.entity.Order;
import ru.eyevision.order.repos.OrderRepo;
import ru.eyevision.order.service.OrderService;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
public class OrderRestController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderRepo orderRepo;


    @GetMapping(path = "/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping(path="/add_order")
    public Order newOrder(@Valid Order newOrder) {
        return orderRepo.save(newOrder);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteOrder(@PathVariable int id, Model model) {
        Order order = orderRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid order Id:" + id));
        orderRepo.delete(order);
        ModelAndView modelAndView = new ModelAndView("redirect:/", (Map<String, ?>) model);
        return modelAndView;
    }

    @PostMapping("/edit/update")
    public ModelAndView topicSave(Model model,
                                  @RequestParam String name,
                                  @RequestParam String orderDate,
                                  @RequestParam("id") Order order
    ) {
        LocalDate dateOrder = null;
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd,yyyy-MM-dd");
        try {
            dateOrder = LocalDate.parse(orderDate, formatter1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dateOrder);

        order.setName(name);
        System.out.println(name);
        orderRepo.save(order);
        ModelAndView modelAndView = new ModelAndView("redirect:/", (Map<String, ?>) model);
        return modelAndView;
    }

}