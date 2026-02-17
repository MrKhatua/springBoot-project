package com.kodewala.request;

import java.util.List;

import com.kodewala.entity.ItemEntity;

public class OrderRequest {
	
	private String status;
	private List<ItemRequest> items;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<ItemRequest> getItems() {
		return items;
	}
	public void setItems(List<ItemRequest> items) {
		this.items = items;
	}
}
