package cinema.app.service;

import java.util.List;
import cinema.app.model.Order;
import cinema.app.model.ShoppingCart;
import cinema.app.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
