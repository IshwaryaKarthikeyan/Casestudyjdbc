package Com.java.exception;

public class exceptions {
	
	public class UserNotFoundException extends Exception {
	    public UserNotFoundException(String message) {
	        super(message);
	}
	}

	public class OrderNotFoundException extends Exception{
	    public OrderNotFoundException(String message) {
	        super(message);
	    }
	}

	}
