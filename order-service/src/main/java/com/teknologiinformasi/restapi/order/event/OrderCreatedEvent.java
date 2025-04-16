package com.teknologiinformasi.restapi.order.event;

import java.io.Serializable;
import java.time.LocalDateTime;


public class OrderCreatedEvent implements Serializable {
    private String orderId;
    private Long productId;
    private int quantity;
    private LocalDateTime orderDate;
    private String orderStatus; // misal: CREATED

   public OrderCreatedEvent(Long long1, Long long2, int i, LocalDateTime localDateTime, String string) {}
   
   public OrderCreatedEvent(String orderId, Long productId, int quantity, LocalDateTime orderDate, String orderStatus) {
       this.orderId = orderId;
       this.productId = productId;
       this.quantity = quantity;
       this.orderDate = orderDate;
       this.orderStatus = orderStatus;
   }
   // Getters & Setters
   public String getOrderId() {
       return orderId;
   }
   public void setOrderId(String orderId) {
       this.orderId = orderId;
   }
   public Long getProductId() {
       return productId;
   }
   public void setProductId(Long productId) {
       this.productId = productId;
   }
   public int getQuantity() {
       return quantity;
   }
   public LocalDateTime getOrderDate() {
       return orderDate;
   }
   public void setOrderDate(LocalDateTime orderDate) {
       this.orderDate = orderDate;
   }
   public String getOrderStatus() {
       return orderStatus;
   }
   public void setOrderStatus(String orderStatus) {
       this.orderStatus = orderStatus;
   }
}