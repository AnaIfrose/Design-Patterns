package design_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer Pattern
 */
public class UserNotifier {
	private List<User> subscribers = new ArrayList<>();
	
	public void addSubscriber(User user) {
		subscribers.add(user);
	}
	
	public void removeSubscriber(User user) {
		subscribers.remove(user);
	}
	
	public void notifySubscribers(String message) {
		for (User user : subscribers) {
			user.notify(message);
        }
	}

}
