package com.teknologiinformasi.restapi.event;

import java.io.Serializable;
import java.time.LocalDateTime;

@SuppressWarnings("unused")
public class OrderCreatedEvent implements Serializable {
   private Long id;
   private Long productId;
   private int quantity;
   private LocalDateTime createdAt;
   private String orderStatus; // misal: CREATED
   public OrderCreatedEvent() {}
   public OrderCreatedEvent(Long id, Long productId, int quantity, LocalDateTime createdAt, String orderStatus) {
       this.id = id;
       this.productId = productId;
       this.quantity = quantity;
       this.createdAt = createdAt;
       this.orderStatus = orderStatus;
   }
   // Getters & Setters
   public Long getid() {
       return id;
   }
   public void setid(Long id) {
       this.id = id;
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
}