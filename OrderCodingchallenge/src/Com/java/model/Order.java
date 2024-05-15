package Com.java.model;

public class Order {
int orderId;
int userId;

public Order(){
	
}
Order(int orderId,int userId){
	this.orderId=orderId;
	this.userId=userId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Object getUser() {
	// TODO Auto-generated method stub
	return null;
}


}
