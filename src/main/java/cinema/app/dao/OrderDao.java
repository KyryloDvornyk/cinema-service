package cinema.app.dao;

import java.util.List;
import cinema.app.model.Order;
import cinema.app.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
