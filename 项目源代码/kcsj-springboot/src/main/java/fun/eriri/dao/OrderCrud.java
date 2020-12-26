package fun.eriri.dao;

import fun.eriri.pojo.Order;

import java.util.List;

public interface OrderCrud {
    List<Order> getAllOrder();
    List<Order> getInOrder();
    List<Order> getOutOrder();
    Integer deleteOrder(List<Integer> list);

    Integer insertOrder(List<Order> list);

}
