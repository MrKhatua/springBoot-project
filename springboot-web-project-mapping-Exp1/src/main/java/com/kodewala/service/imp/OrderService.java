package com.kodewala.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.entity.ItemEntity;
import com.kodewala.entity.OrderEntity;
import com.kodewala.repository.OrderRepository;
import com.kodewala.request.ItemRequest;
import com.kodewala.request.OrderRequest;
import com.kodewala.service.IOrderService;

@Service
public class OrderService implements IOrderService{
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public String createOrder(OrderRequest orderRequest) {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setStatus(orderRequest.getStatus());
		
		List<ItemRequest> itemRequests = orderRequest.getItems();
		List<ItemEntity> itemEntity = new ArrayList<ItemEntity>();
		
		for(ItemRequest item : itemRequests) {
			ItemEntity entity = new ItemEntity();
			entity.setName(item.getName());
			entity.setQty(item.getQty());
			entity.setPrice(item.getPrice());
			
			itemEntity.add(entity);
		}
		orderEntity.setItems(itemEntity);
		orderRepository.save(orderEntity);
		
		return "Order Created Successfully, Order Id : "+orderEntity.getoId();
	}
	
	public int showOrder() {
			System.out.println("N+1");
			List<OrderEntity> orderEntity = orderRepository.findAllWithItems();
			for(OrderEntity entity : orderEntity) {
				List<ItemEntity> itemEntity = entity.getItems();
				for(ItemEntity out : itemEntity) {
					System.out.println(out.getItemId());
					System.out.println(out.getName());
				}
			}
		return 1;
	}

}
