package com.wesley.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int id;
	
	private OrderStatus(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static OrderStatus valueOf(int id) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getId() == id) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus id");
	}
}
