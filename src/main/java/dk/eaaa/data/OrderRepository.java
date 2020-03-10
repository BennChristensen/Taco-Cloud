package dk.eaaa.data;

import org.springframework.data.repository.CrudRepository;

import dk.eaaa.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
