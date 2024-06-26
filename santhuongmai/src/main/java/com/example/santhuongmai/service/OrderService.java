package com.example.santhuongmai.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.santhuongmai.entity.Orderstatus;
import com.example.santhuongmai.entity.Voucher;
import com.example.santhuongmai.entity.Order;
import com.example.santhuongmai.model.request.CreateOrderRequest;

public interface OrderService {
    
    void placeOrder(CreateOrderRequest request);

    List<Order> getList();
    
    List<Order> getOrderByUser(String username);
    
    ResponseEntity<?> checkOrder(String code);

    ResponseEntity<?> removeOrder(String code);
    // update 
    Order updateOrder(long id, CreateOrderRequest request);
    List<Orderstatus> getListstatus();
    
    List<Order> getListOrder(long id);
}
