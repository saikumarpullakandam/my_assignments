package com.saikumar.resource;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.saikumar.model.Order;
import com.saikumar.repository.OrderRepository;


@RestController
public class OrderController {
	@Autowired
	private OrderRepository repository;
	@PostMapping("/addProduct")
	public int saveBook(@RequestBody Order admin ) {
	repository.save(admin);
	return admin.getId();
}
	@GetMapping("/findSipecificOrder/{id}")
	public Optional<Order> getProduct(@PathVariable int id)
	{
        return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteOrder(@PathVariable int id) {
		repository.deleteById(id);
		return "Order deleted with id: " +id;
	}
	@GetMapping("/findAllOrders")
	public List<Order> getOrders()
	{
		return repository.findAll();
	}

	@PutMapping("/updateOrder")
 public void updateOrder(@RequestBody Order order) {
	if (order != null)
	    repository.save(order);
}
}




