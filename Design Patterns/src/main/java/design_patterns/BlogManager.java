package design_patterns;

import java.util.ArrayList;
import java.util.List;

public class BlogManager {
	private UserNotifier userNotifier;
	private List<Article> articlesList = new ArrayList<>();
	
	public BlogManager() {
		this.userNotifier = new UserNotifier();
	}
	
	public void addArticle(Article article) {
		articlesList.add(article);
		userNotifier.notifySubscribers(article.toString());
	}

	public UserNotifier getUserNotifier() {
		return userNotifier;
	}

	public void setUserNotifier(UserNotifier userNotifier) {
		this.userNotifier = userNotifier;
	}

	public List<Article> getArticlesList() {
		return articlesList;
	}

	public void setArticlesList(List<Article> articlesList) {
		this.articlesList = articlesList;
	}
	
}
