package Com.java.dao;
import java.util.List;

import Com.java.exception.exceptions.OrderNotFoundException;
import Com.java.exception.exceptions.UserNotFoundException;
import Com.java.model.Product;
import Com.java.model.User;


	public interface IOrderManagementRepository {
	  
		void createOrder(User user, List<Product> products);

	    void cancelOrder(int userId, int orderId)throws UserNotFoundException, OrderNotFoundException, Com.java.dao.OrderProcessor.UserNotFoundException, Com.java.dao.OrderProcessor.OrderNotFoundException;

	    void createProduct(User user, Product product);

	    void createUser(User user);
	    
	    List<Product> getAllProducts();

	    List<Product> getOrderByUser(User user);


	


	}

