package com.techmonks.order.controller;

import com.techmonks.order.model.OrderModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("orders/{orderId}")
    public ResponseEntity<OrderModel> getOrderById(@PathVariable String orderId){
        OrderModel orderModel = new OrderModel();
        orderModel.setOrderId("12345");
        return ResponseEntity.ok(orderModel);
    }
}
