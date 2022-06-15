package design_patterns;

import java.util.Date;
import java.util.List;

/**
 * Builder Pattern
 */
public class Article {
	private String title;
    private List<String> categories;
    private String content;
    private String author;
    private Date postingDate;
    private List<String> references;
    private List<String> images;
    private boolean ageRestricted;

   
    public Article(String title, String content, String author, Date postingDate) {
    	this.title = title;
		this.content = content;
		this.author = author;
		this.postingDate = postingDate;
	}
    
    public Article(String title, List<String> categories, String content, String author, Date postingDate,
			List<String> references, List<String> images, boolean ageRestricted) {
		this.title = title;
		this.categories = categories;
		this.content = content;
		this.author = author;
		this.postingDate = postingDate;
		this.references = references;
		this.images = images;
		this.ageRestricted = ageRestricted; 
	}


	@Override
    public String toString() {
    	return title + ", written by " + author;
    }

    public static class ArticleBuilder {

        private final Article article;

        public ArticleBuilder(String title, String content, String author, Date postingDate)
        {
            this.article = new Article(title, content, author, postingDate);
        }

        public ArticleBuilder withReferences(List<String> references) {
            this.article.references = references;
            return this;
        }
        
        public ArticleBuilder setCategories(List<String> categories) {
            this.article.categories = categories;
            return this;
        }

        public ArticleBuilder withImages(List<String> images) {
            this.article.images = images;
            return this;
        }
        
        public ArticleBuilder isAgeRestricted(boolean ageRestricted) {
            this.article.ageRestricted = ageRestricted;
            return this;
        }
        
        public Article build() {
        	return this.article;
        }
    }
}
