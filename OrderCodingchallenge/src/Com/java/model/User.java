package Com.java.model;

public class User {
	static int userId;
	String username;
	 String password;
	String role;
	
	public User(){
		
	}
	
	User(int userId,String username,String password,String role){
		this.userId=userId;
		this.username=username;
		this.password=password;
		this.role=role;
	}

	public static int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setorderId(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	
}
