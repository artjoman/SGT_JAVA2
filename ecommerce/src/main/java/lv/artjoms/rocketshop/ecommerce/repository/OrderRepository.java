package lv.artjoms.rocketshop.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}