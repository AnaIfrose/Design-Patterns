package design_patterns;

public class User {
	 private String name;
	 
	 public User(String name) {
		this.name = name;
	}

	public void notify(String message) {
	        System.out.println("Hey " + this.name + "! \nThere is a new article on blog: " + message);
	 }
	  
}
