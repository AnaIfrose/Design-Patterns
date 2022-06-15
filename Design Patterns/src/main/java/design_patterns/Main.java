package design_patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Scenariul reprezinta un blog ce trimite notificari catre abonati cand este postat un nou articol.
 */
public class Main {

	public static void main(String[] args) {
		User user1 = new User("Radu");
	    User user2 = new User("Laura");
	    
		BlogManager blogManager = new BlogManager();
		blogManager.getUserNotifier().addSubscriber(user1);
		blogManager.getUserNotifier().addSubscriber(user2);

		List<String> categories1 = new ArrayList<String>(Arrays.asList("life"));
		Article article1 = new Article("If you don't mind, it doesn't matter", categories1, "Content1", "Author1", new Date(), null, null, false);

		blogManager.addArticle(article1);
		
		List<String> categories2 = new ArrayList<String>(Arrays.asList("war", "freedom"));
		Article article2 = new Article.ArticleBuilder("Religion isn't the cause of wars, it's the excuse", "Content2", "Author2", new Date()).setCategories(categories2).isAgeRestricted(true).build();
		
		blogManager.addArticle(article2);
		
		List<String> categories3 = new ArrayList<String>(Arrays.asList("life", "routine"));
		List<String> refernces3 = new ArrayList<String>(Arrays.asList("reference1", "reference2"));
		Article article3 = new Article.ArticleBuilder("May your coffee be strong and your Monday short", "Content3", "Author3", new Date()).setCategories(categories3).withReferences(refernces3).build();
		
		blogManager.addArticle(article3);
	}

}
